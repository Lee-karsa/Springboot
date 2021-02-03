package com.Controller;

import com.Service.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Controller AdminLoginController
 * @todo //todo:
 */

@Controller
public class AdminLoginController {

    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @RequestMapping("/")
    public String Index1(){
        return "login";
    }

    @PostMapping("/login")
    public String Login(String email, String password, Model model){
        if (adminServiceImpl.findByAllEmail(email).getPassword().equals(password)){
            model.addAttribute("msg",adminServiceImpl.findByAllEmail(email).getName());
            return "index";
        }else {
            model.addAttribute("msg","账户密码错误");
            return "login";
        }
    }

    @PostMapping("/register")
    public String Register(String name,String email,String password){
        return "index1";
    }
}
