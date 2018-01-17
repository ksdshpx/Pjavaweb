package cn.ksdshpx.day09.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/14
 * Time: 21:50
 * Description:HttpServlet的原理以及405错误的演示
 */
/*
 * service(ServletRequest request,ServletResponse response)
 *                        |（对参数进行强转）
 *                        ↓
 * service(HttpServletRequest request,HttpServletResponse response)
 *                        |（获取请求方式，根据请求方式调用相应的方法）
 *                        ↓
 *                 doGet()或doPost()
 */
public class CServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("CServlet Start When Tomcat Start..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()...");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost()...");
    }
}
