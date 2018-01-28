package cn.ksdshpx.day10.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/28
 * Time: 17:25
 * Description:获取请求路径相关的方法
 */
public class SServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //路径 http://locolhost:8080/Pjavaweb/SServlet?username=zhangsan&password=123
        out.print("请求协议：" + request.getScheme() + "<br/>");//http
        out.print("请求服务器名称：" + request.getServerName() + "<br/>");// locolhost
        out.print("请求服务器端口号：" + request.getServerPort() + "<br/>");// 8080
        out.print("请求项目路径：" + request.getContextPath() + "<br/>");// /Pjavaweb
        out.print("请求Servlet路径：" + request.getServletPath() + "<br/>");// /SServlet
        out.print("请求查询字符串路径：" + request.getQueryString() + "<br/>");// username=zhangsan&password=123
        out.print("请求URI：" + request.getRequestURI() + "<br/>");// /Pjavaweb/SServlet
        out.print("请求URL：" + request.getRequestURL() + "<br/>");// http://locolhost:8080/Pjavaweb/SServlet

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
