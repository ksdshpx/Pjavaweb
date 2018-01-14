package cn.ksdshpx.day09.web.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/14
 * Time: 16:02
 * Description:理解GenericServlet的init()的原理
 */
public class BServlet extends MyGenericServlet {
    @Override
    public void init() {
        System.out.println("BServlet init()...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) {
        this.getServletConfig().getInitParameter("name");
    }
}
