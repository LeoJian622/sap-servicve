package cn.com.wdi.scm.converter;

import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.vo.OutOfSaleLabelVO;
import lombok.extern.slf4j.Slf4j;

/**
 * 外购标签PO转换为VO
 *
 * @author liyongjian
 * @create 2020-04-26 14:54
 */

@Slf4j
public class WdiPoLabel2OutOfSaleLabelVOConverter {

    public static OutOfSaleLabelVO convert(WdiPoLabel wdiPoLabel){
        if (null == wdiPoLabel){
            log.error("OutOfSaleLabelDTO 为空不能转换");
            throw new NullPointerException();
        }
        return OutOfSaleLabelVO.builder()
                .id(wdiPoLabel.getFdId())
                .description(wdiPoLabel.getFdName())
                .materialId(wdiPoLabel.getFdMaterial())
                .packType(wdiPoLabel.getFdPackType())
                .productTime(wdiPoLabel.getFdProductTime())
                .purchaseOrder(wdiPoLabel.getFdSaleOrder())
                .quantity(Integer.parseInt(wdiPoLabel.getFdQuantity()))
                .stock(wdiPoLabel.getFdStock())
                .stockId(wdiPoLabel.getFdStockId())
                .supplyId(wdiPoLabel.getFdComId())
                .build();
    }
}
