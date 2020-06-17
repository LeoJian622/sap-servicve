package cn.com.wdi.scm.sap.api.service.impl;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.SapFunctionMapper;
import cn.com.wdi.scm.model.master.SapFunction;
import cn.com.wdi.scm.query.SapFunctionQuery;
import cn.com.wdi.scm.sap.api.service.SapFunctionService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.SapFunctionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * SAP函数配置服务实现
 *
 * @author liyongjian
 * @date 2020-05-14 15:46
 */

@Service
@Slf4j
public class SapFunctionServiceImpl implements SapFunctionService {

    @Autowired
    private SapFunctionMapper sapFunctionMapper;

    /**
     * 新增函数配置
     *
     * @param sapFunction 函数配置对象
     * @return
     */
    @Override
    public SapFunction save(SapFunction sapFunction) throws Exception {
        sapFunctionMapper.insert(sapFunction);
        log.info("insert success, id: [{}]", sapFunction.getId());
        return sapFunction;
    }

    /**
     * 更新函数配置
     *
     * @param sapFunction 函数配置对象
     * @return
     */
    @Override
    public SapFunction update(SapFunction sapFunction) throws Exception {
        sapFunctionMapper.updateByPrimaryKeySelective(sapFunction);
        log.info("update success, id: [{}]", sapFunction.getId());
        return sapFunction;
    }

    /**
     * 删除函数配置
     *
     * @param id 函数配置id
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int delete(String id) throws Exception {
        int re = sapFunctionMapper.deleteByPrimaryKey(id);
        log.info("delete success, id: [{}]", re);
        return re;
    }

    /**
     * 批量删除函数配置
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int delete(String[] ids) throws Exception {
        int total = 0;
        for (String id : ids){
            total += delete(id);
        }
        return total;
    }

    /**
     * 根据主键查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public SapFunction selectById(String id) throws Exception {
        return sapFunctionMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * s
     * 根据主键数组查询对象
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public List<SapFunction> selectByIds(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(SapFunctionMapper.selectList)
                .from(sapFunction)
                .where(id,isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return sapFunctionMapper.selectMany(selectStatementProvider);
    }

    /**
     * 通过查询条件查询
     *
     * @param sapFunctionQuery
     * @return
     * @throws Exception
     */
    @Override
    public List<SapFunction> selectBySapFunctionQuery(SapFunctionQuery sapFunctionQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(SapFunctionMapper.selectList)
                .from(sapFunction)
                .where();
        if (Optional.ofNullable(sapFunctionQuery.getCallName()).isPresent()){
            builder.where(callName,isEqualTo(sapFunctionQuery.getCallName()));
        };

        if (Optional.ofNullable(sapFunctionQuery.getFunctionName()).isPresent()){
            builder.where(functionName,isEqualTo(sapFunctionQuery.getFunctionName()));
        };

        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return sapFunctionMapper.selectMany(selectStatementProvider);
    }
}
