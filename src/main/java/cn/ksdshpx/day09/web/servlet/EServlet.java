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
 * Time: 21:25
 * Description:ServletContext域对象取数据
 */
public class EServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 1.获取ServletContext对象
         * 2.从ServletContext对象中取数据
         */
        ServletContext application = this.getServletContext();
        String name = (String) application.getAttribute("name");
        System.out.println(name);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
