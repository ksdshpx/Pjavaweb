package cn.ksdshpx.day09.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/18
 * Time: 21:43
 * Description:ServletContext对象获取应用初始化参数
 */
public class FServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 1.获取ServletContext对象
         * 2.从ServletContext对象中获取应用初始化参数
         */
        ServletContext application = this.getServletContext();
        String value = application.getInitParameter("context-param");
        System.out.println(value);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
