package site.xbk2000.eduadminsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import site.xbk2000.eduadminsys.service.RegisterService;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/user/register")
    public String register(@RequestParam("username") String username, @RequestParam("password") String password){
        boolean registerSuccOrNot = registerService.registerUser(username, password);
        if (registerSuccOrNot){
            return "注册成功";
        }
        else {
            return "注册失败";
        }

    }


}
