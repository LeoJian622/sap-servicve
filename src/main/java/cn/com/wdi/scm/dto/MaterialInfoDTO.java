package cn.com.wdi.scm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 物料相关信息对象
 *
 * @author liyongjian
 * @create 2020-04-10 10:44
 */

@ApiModel(description = "物料相关信息")
@Data
public class MaterialInfoDTO implements Serializable {

    private static final long serialVersionUID = -77646419426086422L;

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
    private List<WdiPoPakeDTO> pakes;

    /**
     * 采购订单号
     */
    @ApiModelProperty("采购订单号")
    private String[] purchaseOrderless;

}
