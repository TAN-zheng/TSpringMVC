package com.stx.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
* handleRequest()是接口的实现类方法，FirstController会调用该方法来处理请求，并返回
* 包含视图名 或者 包含视图名和模型的ModelAndView对象。
* 本案例：
* 1、向模型对象中添加一个名称为msg的字符串对象。
* 2、设置返回的视图路径为：/WEB-INF/jsp/first.jsp。作用：请求就会转发到first.jsp页面。
*
* */
public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        创建ModelAndView对象
        ModelAndView mav = new ModelAndView();
//        向模型对象中添加数据
        mav.addObject("msg","这是我的第一个Spring mvc 程序");
//        设置逻辑视图名
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
}
