package cn.ksdshpx.day18.web.servlet;

import cn.ksdshpx.commons.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/8/31
 * Time: 10:36
 * Description:
 */
public class TestBaseServlet extends BaseServlet {
    public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("add()...");
        return "f:/bbb.jsp";
    }

    public String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("delete()...");
        return "r:/bbb.jsp";
    }

    public String update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("update()...");
        return "d:/bbb.jsp";
    }
}
