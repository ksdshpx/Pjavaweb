package cn.ksdshpx.day09.web.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/13
 * Time: 11:33
 * Description:查看Servlet接口的方法
 */
public class AServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()...");
        /*
         *获取初始化参数
         */
        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));

        /*
         *获取所有初始化参数的名字
         */
        Enumeration initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            System.out.println(initParameterNames.nextElement());
        }

    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig()...");
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service()...");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo()...");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy()...");
    }
}
