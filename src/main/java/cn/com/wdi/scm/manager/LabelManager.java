package cn.com.wdi.scm.manager;

import cn.com.wdi.scm.dto.MaterialInfoDTO;
import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;

import java.util.List;

/**
 * 外购标签信息服务器
 *
 * @author liyongjina
 * @create 2020-04-10 10:28
 */

public interface LabelManager {

    /**
     * 查询物料号相关信息
     *
     * @param materialNo 物料号
     * @param supplierNo 供应商编号
     * @return MaterialInfoVO 物料基础信息
     * @throws ScmException 查询异常
     */
    MaterialInfoDTO queryMaterialOutSaleLabelInfo(String materialNo, String supplierNo) throws ScmException;

    /**
     * 生成标签
     *  @param unit
     * @param total
     * @param outOfSaleLabelDTO
     * @return
     */
    List<WdiPoLabel> insertLabels(Integer unit, Integer total, OutOfSaleLabelDTO outOfSaleLabelDTO) throws ScmException;

    /**
     * 获取标签ID
     * @param count
     * @return
     */
    int updateLabelId(int count);
}
