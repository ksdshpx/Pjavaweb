package cn.ksdshpx.day10.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/28
 * Time: 14:54
 * Description:获取客户端IP地址、请求方式以及客户端的信息（操作系统和浏览器）
 */
public class RServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ip = request.getRemoteAddr();
        System.out.println("IP地址："+ip);
        String method = request.getMethod();
        System.out.println("请求方式："+method);
        String userAgent = request.getHeader("User-Agent");
        System.out.println(userAgent);
        if(userAgent.toLowerCase().contains("chrome")){
            System.out.println("您好，"+ip+",谷歌浏览器");
        }else if(userAgent.toLowerCase().contains("firefox")){
            System.out.println("您好，"+ip+",火狐浏览器");
        }else if(userAgent.toLowerCase().contains("msie")){
            System.out.println("您好，"+ip+",IE浏览器");
        }else{
            System.out.println("您好，"+ip+",不常用浏览器");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
