package cn.ksdshpx.day09.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/19
 * Time: 14:33
 * Description:获取资源相关的方法
 */
public class HServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 获取资源的真实路径
         */
        String realPath = this.getServletContext().getRealPath("/index.jsp");
        System.out.println(realPath);//D:\iwork\Tomcat\apache-tomcat-8.5.24\webapps\Pjavaweb\index.jsp

        /*
         * 获取资源真实路径并封装成流的形式
         */
        InputStream inputStream = this.getServletContext().getResourceAsStream("/index.jsp");

        /*
         * 获取资源下所有的内容
         */
        Set resourcePaths = this.getServletContext().getResourcePaths("/WEB-INF");
        System.out.println(resourcePaths);//[/WEB-INF/lib/,/WEB-INF/classes,/WEB-INF/web.xml]
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
