package cn.com.wdi.scm.vo;

import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import lombok.Data;

import java.util.List;

/**
 * 生成标签显示VO
 *
 * @author liyongjian
 * @create 2020-04-26 11:57
 */

@Data
public class LabelGenerateVO {
    private List<WdiPoLabel> lableList;
}
