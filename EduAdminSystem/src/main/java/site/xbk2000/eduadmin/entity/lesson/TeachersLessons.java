package site.xbk2000.eduadmin.entity.lesson;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 教师任课表对应的实体类，存放老师与课程的对应关系。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class TeachersLessons {

    /**
     * 教师id
     * */
    private int tid;

    /**
     * 课程id
     * */
    private int lid;
}
