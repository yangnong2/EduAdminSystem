package site.xbk2000.eduadminsys.entity.scholarship;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 奖学金表对应的实体类。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Scholarships {

    /**
     * 奖学金名
     * */
    private String schname;

    /**
     * 奖金
     * */
    private int money;

    /**
     * 描述
     * */
    private String description;
}
