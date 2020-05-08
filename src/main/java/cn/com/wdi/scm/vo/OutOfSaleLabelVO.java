package cn.com.wdi.scm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 标签
 *
 * @author liyongjian
 * @create 2020-04-16 16:02
 */

@Data
@Builder
@SuppressWarnings("serial")
public class OutOfSaleLabelVO implements Serializable{

    /**
     * 标签编号
     */
    private String id;

    /**
     * 物料号
     */
    private String materialId;

    /**
     * 供应商编号
     */
    private String supplyId;

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
     * 数量
     */
    private Integer quantity;

    /**
     * 包装方式
     */
    private String packType;

    /**
     * 采购订单
     */
    private String purchaseOrder;

    /**
     * 生产日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date productTime;
}
