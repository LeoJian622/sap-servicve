package cn.com.wdi.scm.dto;

import cn.com.wdi.scm.model.ekp.WdiPoPake;
import lombok.Data;

import java.util.List;

/**
 * 物料相关信息对象
 *
 * @author liyongjian
 * @create 2020-04-10 10:44
 */

@Data
public class MaterialInfoDTO {

    /**
     * 物料描述
     */
    private String description;

    /**
     * 储位
     */
    private String stock;

    /**
     * 库位
     */
    private String stockId;

    /**
     * 包装方式
     */
    private List<WdiPoPakeDTO> pakes;

    /**
     * 采购订单号
     */
    private List<PurchaseOrdersDTO> purchaseOrderses;

}
