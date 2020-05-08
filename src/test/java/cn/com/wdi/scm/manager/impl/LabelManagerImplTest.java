package cn.com.wdi.scm.manager.impl;

import cn.com.wdi.scm.dto.MaterialInfoDTO;
import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.manager.LabelManager;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("外购标签信息服务测试")
@Slf4j
class LabelManagerImplTest {

    @Autowired
    LabelManager labelManager;

    @Test
    void queryMaterialOutSaleLabelInfo() {
        try {
            MaterialInfoDTO re = labelManager.queryMaterialOutSaleLabelInfo("511791-Y1", "102632");
            System.out.println(re);
        } catch (ScmException e) {
            e.printStackTrace();
        }
    }

    @Test
    void insertLabels() throws ScmException {
        OutOfSaleLabelDTO outOfSaleLabelDTO = OutOfSaleLabelDTO.builder()
                .materialId("511791-Y1")
                .supplyId("102632")
                .description("和利多外箱630*345*480mm DAN 1.0版")
                .stockId("1101")
                .packType("C")
                .productTime(new Date())
                .purchaseOrder("4500004441/00550")
                .build();
        int unit = 10;
        int total = 100;
        List<WdiPoLabel> resutl = labelManager.insertLabels(unit, total, outOfSaleLabelDTO);
        System.out.println(resutl);
    }

    @Test
    void updateLabelId() {
        labelManager.updateLabelId(5);
    }
}
