package site.xbk2000.eduadminsys.entity.lesson;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 对应课程类别表的实体类，存放了所有的课程类别。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class LessonCategories {

    /**
     * 类别名
     * */
    private String cname;

}
