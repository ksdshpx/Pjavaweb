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
 * Time: 21:22
 * Description:ServletContext域对象存储数据
 */
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * 1.获取ServletContext对象
        * 2.往ServletContext对象中存储数据
         */
        ServletContext application = this.getServletContext();
        application.setAttribute("name","张三");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
