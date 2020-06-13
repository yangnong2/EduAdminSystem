package site.xbk2000.eduadmin.entity.people;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 角色表对应的实体类
 * @author xbk
 *
 */
@Component
@Data
@NoArgsConstructor
public class Roles {

    /**
     * 角色名
     * */
    private String rname;

}
