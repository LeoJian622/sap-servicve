package cn.com.wdi.scm.converter;

import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liyongjian
 * @create 2020-04-24 17:23
 */

@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
@Slf4j
public class OutOfSaleLabelDTO2WdiPoLabelConverter {

    public static WdiPoLabel convert(OutOfSaleLabelDTO outOfSaleLabelDTO){
        if (null == outOfSaleLabelDTO){
            log.error("OutOfSaleLabelDTO 为空不能转换");
            throw new NullPointerException();
        }
        WdiPoLabel wdiPoLabel = new WdiPoLabel();
        wdiPoLabel.setFdComId(outOfSaleLabelDTO.getSupplyId());
        wdiPoLabel.setFdSaleOrder(outOfSaleLabelDTO.getPurchaseOrder());
        wdiPoLabel.setFdMaterial(outOfSaleLabelDTO.getMaterialId());
        wdiPoLabel.setFdName(outOfSaleLabelDTO.getDescription());
        wdiPoLabel.setFdStockId(outOfSaleLabelDTO.getStockId());
        wdiPoLabel.setFdStock(outOfSaleLabelDTO.getStock());
        wdiPoLabel.setFdPackType(outOfSaleLabelDTO.getPackType());
        wdiPoLabel.setFdProductTime(outOfSaleLabelDTO.getProductTime());
        return wdiPoLabel;
    }
}
