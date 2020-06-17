package cn.com.wdi.scm.sap.api.service.impl;

import cn.com.wdi.scm.converter.SapConfig2PropertiesConverter;
import cn.com.wdi.scm.enums.ScmExceptionEnum;
import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.SapConfigMapper;
import cn.com.wdi.scm.mapper.master.SapFunctionMapper;
import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.query.SapConfigQuery;
import cn.com.wdi.scm.sap.api.config.CustomDestinationDataProvider;
import cn.com.wdi.scm.sap.api.service.SapConfigService;
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

import static cn.com.wdi.scm.mapper.master.SapConfigDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * SAP服务器配置服务实现
 *
 * @author liyongjian
 * @date 2020-05-21 15:13
 */

@Service
@Slf4j
public class SapConfigServiceImpl implements SapConfigService {
    
    @Autowired
    SapConfigMapper sapConfigMapper;


    @Autowired
    CustomDestinationDataProvider customDestinationDataProvider;

    /**
     * 新增SAP服务器配置
     *
     * @param sapConfig 函数配置对象
     * @return SapConfig 返回函数配置对象
     * @throws Exception
     */
    @Override
    public SapConfig save(SapConfig sapConfig) throws Exception {
        sapConfigMapper.insert(sapConfig);
        log.info("insert success, id: [{}]", sapConfig.getId());
        customDestinationDataProvider.changeProperties(sapConfig.getDestName(), SapConfig2PropertiesConverter.convert(sapConfig));
        log.info("customDestinationDataProvider update, id: [{}]", sapConfig.getId());
        return sapConfig;
    }

    /**
     * 更新SAP服务器配置
     *
     * @param sapConfig 配置更新对象
     * @return SapConfig 返回函数更新后对象
     * @throws Exception
     */
    @Override
    public SapConfig update(SapConfig sapConfig) throws Exception {
        sapConfigMapper.updateByPrimaryKeySelective(sapConfig);
        log.info("update success, id: [{}]", sapConfig.getId());
        Optional<SapConfig> sapConfigOptional = sapConfigMapper.selectByPrimaryKey(sapConfig.getId());
        customDestinationDataProvider.changeProperties(sapConfigOptional.map(SapConfig::getDestName).orElseThrow(() -> new ScmException(ScmExceptionEnum.SERVER_NULL_POINT_EXCEPTION)),SapConfig2PropertiesConverter.convert(sapConfigOptional.get()));
        return sapConfigOptional.get();
    }

    /**
     * 删除SAP服务器配置
     *
     * @param id 删除对象的主键值
     * @return int 返回删除条数
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int delete(String id) throws Exception {
        Optional<SapConfig> sapConfigOptional = sapConfigMapper.selectByPrimaryKey(id);
        int count = sapConfigMapper.deleteByPrimaryKey(id);
        log.info("delete success, id: [{}]", count);
        customDestinationDataProvider.changeProperties(sapConfigOptional.map(SapConfig::getDestName).orElseThrow(() -> new ScmException(ScmExceptionEnum.SERVER_NULL_POINT_EXCEPTION)),null);
        return count;
    }

    /**
     * 批量删除SAP服务器配置
     *
     * @param ids 删除对象的主键数组
     * @return 返回删除条数
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
     * @param id 查询的主键值
     * @return SapConfig 返回查询结果
     * @throws Exception
     */
    @Override
    public SapConfig selectById(String id) throws Exception {
        return sapConfigMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * s
     * 根据主键数组查询对象
     *
     * @param ids 查询的主键数组
     * @return 返回查询结果
     * @throws Exception
     */
    @Override
    public List<SapConfig> selectByIds(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(SapFunctionMapper.selectList)
                .from(sapConfig)
                .where(id,isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return sapConfigMapper.selectMany(selectStatementProvider);
    }

    /**
     * 通过查询条件查询
     *
     * @param sapConfigQuery 查询条件对象
     * @return List<SapConfig> 结果对象
     * @throws Exception
     */
    @Override
    public List<SapConfig> selectBySapConfigQuery(SapConfigQuery sapConfigQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(SapConfigMapper.selectList)
                .from(sapConfig)
                .where();
        if (Optional.ofNullable(sapConfigQuery.getAshost()).isPresent()){
            builder.where(ashost,isEqualTo(sapConfigQuery.getAshost()));
        }

        if (Optional.ofNullable(sapConfigQuery.getClient()).isPresent()){
            builder.where(client,isEqualTo(sapConfigQuery.getClient()));
        }

        if (Optional.ofNullable(sapConfigQuery.getDestName()).isPresent()){
            builder.where(destName,isEqualTo(sapConfigQuery.getDestName()));
        }

        if (Optional.ofNullable(sapConfigQuery.getUserName()).isPresent()){
            builder.where(username,isEqualTo(sapConfigQuery.getUserName()));
        }

        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return sapConfigMapper.selectMany(selectStatementProvider);
    }
}
