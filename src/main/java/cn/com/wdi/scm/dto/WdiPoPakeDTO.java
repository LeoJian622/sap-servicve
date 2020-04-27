package cn.com.wdi.scm.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 包装方式对象
 *
 * @author ??????
 * @create 2020-04-14 16:29
 */
@Data
@Builder
public class WdiPoPakeDTO {

    /**
     * 包装数量
     */
    private Integer fdQty;

    /**
     * 包装方式
     */
    private String fdPackType;
}
