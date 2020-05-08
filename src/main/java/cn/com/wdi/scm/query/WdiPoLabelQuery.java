package cn.com.wdi.scm.query;

import io.swagger.annotations.ApiImplicitParam;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * 外购标签查询条件
 *
 * @author liyongjian
 * @create 2020-04-27 11:54
 */

@Data
@Builder
public class WdiPoLabelQuery {

    /**
     * 标签ID
     */
    String targetId;

    /**
     * 物料号
     */
    String material;

    /**
     * 供应商编号
     */
    String supplyId;

    /**
     * 创建人
     */
    String name;

    /**
     * 生产时间-开始
     */
    Date sDate;

    /**
     * 生产时间-结束
     */
    Date eDate;

    /**
     * 页数
     */
    Integer page;

    /**
     * 每页行数
     */
    Integer row;
}
