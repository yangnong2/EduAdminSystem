package site.xbk2000.eduadminsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    @ResponseBody
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        if ("xbk".equals(username) && "123".equals(password)){
            return "loginOK";
        }
        else {
            return "false";
        }
    }
}
