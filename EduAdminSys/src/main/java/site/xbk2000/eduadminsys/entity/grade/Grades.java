package site.xbk2000.eduadminsys.entity.grade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 对应成绩表的实体类，表示某个通信某门课的成绩。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Grades {

    /**
     * 学生id
     * */
    private int sid;

    /**
     * 教师id
     * */
    private int tid;

    /**
     * 课程id
     * */
    private int lid;

    /**
     * 课程类别id
     * */
    private int cid;

    /**
     * 分数
     * */
    private int score;

    /**
     * 是否合格
     * */
    private int passOrNot;

    /**
     * 是否是重修
     * */
    private int retakeOrNot;
}
