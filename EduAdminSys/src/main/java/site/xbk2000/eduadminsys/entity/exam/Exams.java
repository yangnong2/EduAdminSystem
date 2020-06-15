package site.xbk2000.eduadminsys.entity.exam;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 对应考试表的实体类，表示某门课的考试时间等信息。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Exams {

    /**
     * 课程id
     * */
    private int lid;

    /**
     * 课程类别id
     * */
    private int cid;

    /**
     * 考试时间
     * */
    private Date examTime;

    /**
     * 是否为补考考试
     * */
    private int reexamOrNot;
}
