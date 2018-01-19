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
 * Date: 2018/1/19
 * Time: 15:02
 * Description:网站访问量统计
 */
public class IServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = this.getServletContext();
        Integer count = (Integer) application.getAttribute("count");
        if (count == null) {
            count = 1;
        } else {
            count++;
        }
        application.setAttribute("count", count);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("共访问了<h2>"+count+"</h2>次");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
