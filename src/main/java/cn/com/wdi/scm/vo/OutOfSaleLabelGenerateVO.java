package cn.com.wdi.scm.vo;

import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 标签
 *
 * @author liyongjian
 * @create 2020-04-16 16:02
 */

@ApiModel(description = "生成标签基础数据对象")
@Data
@Builder
@AllArgsConstructor
public class OutOfSaleLabelGenerateVO implements Serializable{

    private static final long serialVersionUID = 8679722211721076046L;

    /**
     * 单位数量
     */
    @ApiModelProperty("单位数量")
    private Integer unit;

    /**
     * 总数量
     */
    @ApiModelProperty("总数量")
    private Integer total;

    /**
     * 标签信息对象
     */
    @ApiModelProperty("标签信息对象")
    private OutOfSaleLabelDTO outOfSaleLabel;

}
