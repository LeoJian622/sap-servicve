package cn.com.wdi.scm.controller;

import cn.com.wdi.scm.dto.MaterialInfoDTO;
import cn.com.wdi.scm.manager.LabelManager;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.vo.LabelGenerateVO;
import cn.com.wdi.scm.vo.OutOfSaleLabelGenerateVO;
import cn.com.wdi.scm.vo.OutOfSaleLabelVO;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.select;

/**
 * 标签生成控制器
 *
 * @author ??????
 * @create 2020-04-15 16:52
 */

@RequestMapping("/label")
@RestController
public class WdiLabelController {

    @Autowired
    LabelManager labelManager;

    @PostMapping("/generate")
    public LabelGenerateVO generate(@RequestBody OutOfSaleLabelGenerateVO outOfSaleLabelGenerateVO) throws Exception {
        System.out.println(outOfSaleLabelGenerateVO);
        List<WdiPoLabel> labelList = labelManager.insertLabels(outOfSaleLabelGenerateVO.getUnit(),outOfSaleLabelGenerateVO.getTotal(),outOfSaleLabelGenerateVO.getOutOfSaleLabel());
        LabelGenerateVO labelGenerateVO = new LabelGenerateVO();
        labelGenerateVO.setLableList(labelList);
        return labelGenerateVO;
    }

    /**
     *
     * @param material
     * @param supplier
     * @return
     * @throws Exception
     */
    @GetMapping("/info/{material}/{supplier}")
    public MaterialInfoDTO info(@PathVariable String material,@PathVariable String supplier) throws Exception {
        return labelManager.queryMaterialOutSaleLabelInfo(material, supplier);
    }

    /**
     *
     * @param material
     * @param supplier
     * @return
     * @throws Exception
     */
    @GetMapping("/list/{material}/{supplier}")
    public List<OutOfSaleLabelVO> list(@PathVariable String material,@PathVariable String supplier) throws Exception {
        return null;
    }

}
