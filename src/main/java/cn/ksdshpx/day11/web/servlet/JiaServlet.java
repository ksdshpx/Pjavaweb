package cn.ksdshpx.day11.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/2/4
 * Time: 15:46
 * Description:jsp和Servlet分工演示
 */
public class JiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取参数
        String s1 = request.getParameter("num1");
        String s2 = request.getParameter("num2");
        Integer num1 = Integer.parseInt(s1);
        Integer num2 = Integer.parseInt(s2);

        //2.计算
        int sum = num1 + num2;

        //3.将结果保存到request域中
        request.setAttribute("result", sum);

        //4.转发到result.jsp
        request.getRequestDispatcher("/jia/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
