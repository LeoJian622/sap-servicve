package cn.com.wdi.scm.service;

import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.query.WdiPoLabelQuery;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import java.util.List;

/**
 * @author liyongjian
 * @create 2020-04-27 9:01
 */

public interface WdiPoLabelService {

    /**
     * 通过查询条件查询对象
     * @param wdiPoLabelQuery 查询条件
     * @return WdiPoLabel 列表
     * @throws Exception
     */
    List<WdiPoLabel> selectByWdiPoLabelQuery(WdiPoLabelQuery wdiPoLabelQuery) throws Exception;

    /**
     * 根据查询对象生成查询条件
     * @param wdiPoLabelQuery 查询条件对象
     * @return
     */
    SelectStatementProvider search(WdiPoLabelQuery wdiPoLabelQuery);
}
