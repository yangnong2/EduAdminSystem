package site.xbk2000.eduadminsys.entity.people;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 人员角色表的实体类，存放人员和角色的对应关系。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class RolesUsers {

    /**
     * 角色id
     * */
    private int rid;

    /**
     * 人员id
     * */
    private int uid;
}
