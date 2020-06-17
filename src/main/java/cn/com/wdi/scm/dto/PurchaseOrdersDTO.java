package cn.com.wdi.scm.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 采购订单信息
 *
 * @author liyongjian
 * @create 2020-04-10 11:03
 */

@ApiModel(description = "采购订单对象")
@Data
public class PurchaseOrdersDTO implements Serializable {

    private static final long serialVersionUID = -2568257072056206020L;

    /**
     * 采购订单号
     */
    private String poNo;

}
