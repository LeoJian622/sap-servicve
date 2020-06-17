package cn.com.wdi.scm.query;

import lombok.Builder;
import lombok.Data;

/**
 * 菜单信息查询对象
 *
 * @author liyongjian
 * @date 2020-05-26 15:14
 */

@Data
@Builder
public class ScmMenuQuery {

    private String url;

    private String path;

    private String name;
}
