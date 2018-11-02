package cn.ksdshpx.day21.web.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/11/2
 * Time: 8:49
 * Description:
 */
public class AccessControlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        if (username.contains("ksdshpx")) {
            request.getSession().setAttribute("admin", username);
        } else {
            request.getSession().setAttribute("username", username);
        }
        request.getRequestDispatcher("/all.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
