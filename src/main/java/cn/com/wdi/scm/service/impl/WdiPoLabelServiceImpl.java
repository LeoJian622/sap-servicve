package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.config.security.UrlFilterInvocationSecurityMetadataSource;
import cn.com.wdi.scm.mapper.ekp.WdiPoLabelDynamicSqlSupport;

import static cn.com.wdi.scm.mapper.ekp.WdiPoLabelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.mapper.ekp.WdiPoLabelMapper;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.query.WdiPoLabelQuery;
import cn.com.wdi.scm.service.WdiPoLabelService;
import com.alibaba.druid.util.StringUtils;
import jdk.nashorn.internal.runtime.options.Option;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsBetweenWhenPresent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author liyongjian
 * @create 2020-04-27 9:02
 */

@Service
public class WdiPoLabelServiceImpl implements WdiPoLabelService {

    @Autowired
    private WdiPoLabelMapper wdiPoLabelMapper;


    /**
     * 通过查询条件查询对象
     *
     * @param wdiPoLabelQuery 查询条件
     * @return WdiPoLabel 列表
     * @throws Exception
     */
    @Override
    public List<WdiPoLabel> selectByWdiPoLabelQuery(WdiPoLabelQuery wdiPoLabelQuery) throws Exception {

        SelectStatementProvider selectStatementProvider = search(wdiPoLabelQuery);

        return Optional.ofNullable(wdiPoLabelMapper.selectMany(selectStatementProvider)).orElse(new ArrayList<>());
    }

    /**
     * 根据查询对象生成查询条件
     *
     * @param wdiPoLabelQuery 查询条件对象
     * @return
     */
    @Override
    public SelectStatementProvider search(WdiPoLabelQuery wdiPoLabelQuery) {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(WdiPoLabelMapper.selectList)
                .from(wdiPoLabel)
                .where();
        if (!StringUtils.isEmpty(wdiPoLabelQuery.getTargetId())) {
            builder.and(fdId, isEqualTo(wdiPoLabelQuery.getTargetId()));
        }
        if (!StringUtils.isEmpty(wdiPoLabelQuery.getMaterial())) {
            builder.and(fdMaterial, isEqualTo(wdiPoLabelQuery.getMaterial()));
        }
        if (!StringUtils.isEmpty(wdiPoLabelQuery.getName())) {
            builder.and(docCreateName, isEqualTo(wdiPoLabelQuery.getName()));
        }
        if (wdiPoLabelQuery.getSDate() != null && wdiPoLabelQuery.getEDate() != null) {
            builder.and(docCreateTime, isBetween(wdiPoLabelQuery.getSDate()).and(wdiPoLabelQuery.getEDate()));
        } else if (wdiPoLabelQuery.getSDate() != null || wdiPoLabelQuery.getEDate() != null) {
            Date temp = wdiPoLabelQuery.getSDate() != null ? wdiPoLabelQuery.getSDate() : wdiPoLabelQuery.getEDate();
            builder.and(docCreateTime, isEqualTo(temp));
        }
//        int page = wdiPoLabelQuery.getPage() == null || wdiPoLabelQuery.getPage() == 0? 1 : wdiPoLabelQuery.getPage();
//        int row = wdiPoLabelQuery.getRow() == null  || wdiPoLabelQuery.getRow() == 0? 20 : wdiPoLabelQuery.getRow();
//        builder.offset(row).fetchFirst(page).rowsOnly();
        return builder.build().render(RenderingStrategies.MYBATIS3);
    }

}
