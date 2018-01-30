package cn.ksdshpx.day10.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/30
 * Time: 20:54
 * Description:请求转发（留头不留体）
 */
public class VServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("VServlet...");
        response.setHeader("aaa","AAA");//留头
        response.getWriter().print("abccc");//不留体
        //向request域中添加属性
        request.setAttribute("username","zhangsan");
        request.getRequestDispatcher("/WServlet").forward(request,response);//请求转发
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
