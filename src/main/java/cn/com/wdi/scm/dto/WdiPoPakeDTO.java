package cn.com.wdi.scm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 包装方式对象
 *
 * @author ??????
 * @create 2020-04-14 16:29
 */

@ApiModel(description = "包装方式信息")
@Data
@Builder
public class WdiPoPakeDTO implements Serializable {

    private static final long serialVersionUID = 4277314637655311397L;

    /**
     * 包装数量
     */
    @ApiModelProperty("包装数量")
    private Integer fdQty;

    /**
     * 包装方式
     */
    @ApiModelProperty("包装方式")
    private String fdPackType;
}
