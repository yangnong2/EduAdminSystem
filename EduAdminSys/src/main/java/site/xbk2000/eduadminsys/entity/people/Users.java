package site.xbk2000.eduadminsys.entity.people;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 人员表的实体类，存放人员的信息。
 * @author xbk
 */
@Component
@Data
@NoArgsConstructor
public class Users {

    /**
     * 人员名
     * */
    private String uname;

    /**
     * 唯一人员标识号
     * */
    private String uniqueUnumber;

    /**
     * 所在院系
     * */
    private int iid;

    /**
     * 密码
     * */
    private String password;

    /**
     * 手机号
     * */
    private String phone;

    /**
     * 身份证号
     * */
    private String identityCard;

    /**
     * 邮箱
     * */
    private String email;

    /**
     * 注册时间
     * */
    private Date regtime;

    /**
     * 入学时间
     * */
    private Date admissionTime;

    /**
     * 毕业时间
     * */
    private Date graduateTime;

    /**
     * 是否留级
     * */
    private int repeatOrNot;

    /**
     * 上次登录时间
     * */
    private Date lastLoginTime;
}
