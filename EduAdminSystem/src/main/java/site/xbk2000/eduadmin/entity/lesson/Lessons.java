package site.xbk2000.eduadmin.entity.lesson;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 课程表对应的实体类，存放课程的信息，比如课程周数，最大人数等等。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Lessons {

    /**
     * 课程名
     * */
    private String lname;

    /**
     * 开设院系id
     * */
    private int iid;

    /**
     * 唯一课程号
     * */
    private String uniqueLnumber;

    /**
     * 从哪一周开始
     * */
    private int start;

    /**
     * 在哪一周结束
     * */
    private int end;

    /**
     * 课程周数
     * */
    private int weeks;

    /**
     * 课程最大人数
     * */
    private int capability;

    /**
     * 教师id
     * */
    private int tid;

    /**
     * 课程类别id
     * */
    private int cid;
}
