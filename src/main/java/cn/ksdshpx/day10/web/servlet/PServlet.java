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
 * Time: 14:27
 * Description:演示禁用浏览器缓存
 */
public class PServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("cache-control","no-cache");
        response.setHeader("pragma","no-cache");
        response.setHeader("expires","-1");
        response.getWriter().print("hello worldworld!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
