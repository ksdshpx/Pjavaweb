package cn.ksdshpx.day09.web.servlet;

import javax.servlet.*;
import java.util.Enumeration;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/14
 * Time: 15:58
 * Description:模拟实现GenericServlet
 */
public abstract class MyGenericServlet implements Servlet {
    private ServletConfig config;

    public void init() {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init()...");
        this.config = config;
        init();
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public abstract void service(ServletRequest req, ServletResponse res);

    @Override
    public String getServletInfo() {
        return "MyGenericServlet";
    }

    @Override
    public void destroy() {
        System.out.println("destroy()...");
    }

    public ServletContext getServletContext() {
        return config.getServletContext();
    }

    public String getInitParameter(String name) {
        return config.getInitParameter(name);
    }

    public String getServletName() {
        return config.getServletName();
    }

    public Enumeration<String> getInitParameterNames() {
        return config.getInitParameterNames();
    }
}
