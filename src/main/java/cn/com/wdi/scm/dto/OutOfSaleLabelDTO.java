package cn.com.wdi.scm.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
public class OutOfSaleLabelDTO{

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date productTime;
}
