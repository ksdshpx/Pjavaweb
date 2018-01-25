package cn.ksdshpx.day10.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/25
 * Time: 10:10
 * Description:response响应头的相关方法
 */
public class LServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //单值的头，-->一个名称对应一个值
        response.setHeader("aaa","AAA");
        //多值的头,-->一个名称对应多个值
        response.addHeader("bbb","BBB");
        response.addHeader("bbb","CCC");
        response.addHeader("bbb","DDD");
        System.out.println("演示response响应头的相关方法");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
