package com.cn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String userLogin(@RequestParam("userName") String userName,
                            @RequestParam("passWard") String passWard,
                            Map<String,Object> map,
                            HttpSession session){
        if(!StringUtils.isEmpty(userName)&&"1234".equals(passWard)){
            //登录成功,防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser",userName);
            return "redirect:/loginsuccess.html";
        }else{
            //登录失败
            map.put("msg","用户名或者密码错误");
            return "login";
        }

    }

}
