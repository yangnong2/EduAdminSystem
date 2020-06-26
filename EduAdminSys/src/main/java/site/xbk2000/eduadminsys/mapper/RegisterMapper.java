package site.xbk2000.eduadminsys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import site.xbk2000.eduadminsys.entity.people.Users;

@Mapper
@Repository
public interface RegisterMapper {
    boolean register(Users user);
}
