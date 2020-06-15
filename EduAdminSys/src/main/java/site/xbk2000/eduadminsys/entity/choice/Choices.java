package site.xbk2000.eduadminsys.entity.choice;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 对应选课表的实体类，表示某个同学选了某个课
 * @author xbk
 *
 */
@Component
@Data
@NoArgsConstructor
public class Choices {

    /**
     * 学生id
     * */
    private int sid;


    /**
     * 课程id
     * */
    private int lid;
}
