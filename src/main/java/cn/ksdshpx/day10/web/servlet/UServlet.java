package cn.ksdshpx.day10.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/28
 * Time: 20:40
 * Description:获取request的请求参数
 */
public class UServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("POST:" + username);
        String password = request.getParameter("password");
        System.out.println("POST:" + password);
        String[] hobbys = request.getParameterValues("hobby");
        System.out.println("POST:" + Arrays.toString(hobbys));
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            System.out.println(parameterNames.nextElement());
        }
        Map<String,String[]> map = request.getParameterMap();
        for(String name : map.keySet()){
            System.out.println(name + "=" + Arrays.toString(map.get(name)));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET:" + request.getParameter("xxx"));
        System.out.println("GET:" + request.getParameter("yyy"));
    }
}
