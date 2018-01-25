package cn.ksdshpx.day10.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/25
 * Time: 16:05
 * Description:响应字节流数据
 */
public class QServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\github.png"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            response.getOutputStream().write(bytes, 0, len);
        }
        bis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
