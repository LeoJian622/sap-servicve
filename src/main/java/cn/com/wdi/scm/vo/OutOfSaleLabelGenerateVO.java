package cn.com.wdi.scm.vo;

import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
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

@Data
@Builder
@AllArgsConstructor
@SuppressWarnings("serial")
public class OutOfSaleLabelGenerateVO implements Serializable{

    private Integer unit;

    private Integer total;

    private OutOfSaleLabelDTO outOfSaleLabel;

}
