package cn.ksdshpx.classloader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/9/10
 * Time: 16:39
 * Description:测试Tomcat的类加载器
 */
public class ClassLoaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ClassLoader classLoader = this.getClass().getClassLoader();
        while (classLoader != null) {
            out.println(classLoader.getClass().getName());
            classLoader = classLoader.getParent();
        }
    }
}
