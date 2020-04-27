package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.service.WdiPoLabelService;

import java.util.List;

/**
 * @author liyongjian
 * @create 2020-04-27 9:02
 */

public class WdiPoLabelServiceImpl implements WdiPoLabelService {
    /**
     * 通过创建者名字搜索
     *
     * @param name 创建人字符串
     * @return WdiPoLabel 列表
     * @throws Exception
     */
    @Override
    public List<WdiPoLabel> selectByDocCreatorName(String name) throws Exception {
        return null;
    }
}
