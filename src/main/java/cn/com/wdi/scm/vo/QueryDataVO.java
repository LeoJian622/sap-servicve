package cn.com.wdi.scm.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 查询数据返回对象
 *
 * @author ??????
 * @create 2020-05-09 17:11
 */

@ApiModel(description = "查询数据返回对象")
@Data
@Builder
public class QueryDataVO implements Serializable {

    private static final long serialVersionUID = 2225676544746102432L;

    /**
     * ID
     */
    @ApiModelProperty("ID")
    private String targetId;

    /**
     * 物料号
     */
    @ApiModelProperty("物料号")
    private String material;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String userName;

    /**
     * 供应商编号
     */
    @ApiModelProperty("供应商编号")
    private String supplyId;

    /**
     * 起始日期
     */
    @ApiModelProperty("起始日期")
    private Date sDate;

    /**
     * 终止日期
     */
    @ApiModelProperty("终止日期")
    private Date eDate;

    /**
     * 当前页数
     */
    @ApiModelProperty("当前页数")
    private Integer page;

    /**
     * 总页数
     */
    @ApiModelProperty("总页数")
    private Integer totalPage;

    /**
     * 行数
     */
    @ApiModelProperty("行数")
    private Integer row;

    /**
     * 查询结果
     */
    @ApiModelProperty("查询结果")
    private List<OutOfSaleLabelVO> pageList;
}
