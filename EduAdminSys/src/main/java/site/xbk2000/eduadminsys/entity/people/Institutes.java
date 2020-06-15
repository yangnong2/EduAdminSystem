package site.xbk2000.eduadminsys.entity.people;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 院系表对应的实体类，存放院系的信息。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Institutes {

    /**
     * 院系名称
     * */
    private String iname;
}
