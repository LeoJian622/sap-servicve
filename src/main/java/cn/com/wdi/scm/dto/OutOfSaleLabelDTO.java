package cn.com.wdi.scm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 标签
 *
 * @author liyongjian
 * @create 2020-04-16 16:02
 */

@ApiModel(description = "标签基础信息")
@Data
@Builder
public class OutOfSaleLabelDTO implements Serializable {

    private static final long serialVersionUID = 4082822255505658383L;

    /**
     * 物料号
     */
    @ApiModelProperty("物料号")
    private String materialId;

    /**
     * 供应商编号
     */
    @ApiModelProperty("供应商编号")
    private String supplyId;

    /**
     * 物料描述
     */
    @ApiModelProperty("物料描述")
    private String description;

    /**
     * 储位
     */
    @ApiModelProperty("储位")
    private String stock;

    /**
     * 库位
     */
    @ApiModelProperty("库位")
    private String stockId;

    /**
     * 包装方式
     */
    @ApiModelProperty("包装方式")
    private String packType;

    /**
     * 采购订单
     */
    @ApiModelProperty("采购订单")
    private String purchaseOrder;

    /**
     * 生产日期
     */
    @ApiModelProperty("生产日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date productTime;
}
