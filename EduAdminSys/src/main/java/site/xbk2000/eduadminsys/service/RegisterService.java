package site.xbk2000.eduadminsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.xbk2000.eduadminsys.entity.people.Users;
import site.xbk2000.eduadminsys.mapper.RegisterMapper;

@Service
public class RegisterService {

    @Autowired
    RegisterMapper registerMapper;

    public boolean registerUser(String username, String password){

//        Users user = new Users(username, "120171080213", 1, password, "13121809732", );
        return true;
    }

}
