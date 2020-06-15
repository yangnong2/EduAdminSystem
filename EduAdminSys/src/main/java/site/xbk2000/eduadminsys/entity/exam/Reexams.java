package site.xbk2000.eduadminsys.entity.exam;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 对应补考表的实体类，包含所有待补考的信息，就是某个同学应该补考某门课程。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Reexams {

    /**
     * 学生id
     * */
    private int sid;

    /**
     * 课程id
     * */
    private int lid;

    /**
     * 分数
     * */
    private int score;

    /**
     * 补考时间
     * */
    private Date retakeTime;
}
