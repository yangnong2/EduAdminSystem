package site.xbk2000.eduadmin.entity.scholarship;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 奖学金申请表的实体类。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Applications {

    /**
     * 学生id
     * */
    private int sid;

    /**
     * 奖学金id
     * */
    private int schid;

    /**
     * 申请时间
     * */
    private Date time;

    /**
     * 是否通过
     * */
    private int approveOrNot;

    /**
     * 审批概述
     * */
    private String reviews;
}
