package com.cn.springboot.config;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录检查
 */
@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //目标方法执行之前进行检查
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        System.out.println("user的值"+user);
        if(user==null){
            //未登录，返回登录页面
            request.setAttribute("msg","你没有权限，请先登录");
            //此处不能写/login.html,因为我们不能直接访问模板里面的页面
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }else{
            //已登录
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
