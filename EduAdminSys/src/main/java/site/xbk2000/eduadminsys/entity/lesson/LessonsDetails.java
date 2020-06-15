package site.xbk2000.eduadminsys.entity.lesson;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 课程明细表对应的实体类，存放每门课程在一周内的具体上课时间
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class LessonsDetails {

    /**
     * 课程id
     * */
    private int lid;

    /**
     * 第一节课时间
     * */
    private int first;

    /**
     * 第二节课时间
     * */
    private int second;

    /**
     * 第三节课时间
     * */
    private int third;

    /**
     * 第四节课时间
     * */
    private int fourth;

    /**
     * 第五节课时间
     * */
    private int fifth;
}
