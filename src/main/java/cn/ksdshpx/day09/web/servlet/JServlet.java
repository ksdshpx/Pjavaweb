package cn.ksdshpx.day09.web.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/19
 * Time: 16:06
 * Description:获取类路径下资源的两种方式
 */
public class JServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.通过ClassLoader获取。相对于/classes
        /*InputStream inputStream = JServlet.class.getClassLoader().getResourceAsStream("a.txt");
        String s = IOUtils.toString(inputStream);
        System.out.println(s);*/

        //2.通过Class获取。路径不以/开头时，相对于当前类的.class文件
       /* InputStream inputStream2 = JServlet.class.getResourceAsStream("../../../../../a.txt");
        String ss = IOUtils.toString(inputStream2);
        System.out.println(ss);*/

        //3.通过Class获取,路径以/开头时，相对于当前类的.class文件
       /* InputStream inputStream3 = JServlet.class.getResourceAsStream("/a.txt");
        String ss = IOUtils.toString(inputStream3);
        System.out.println(ss);*/

        InputStream inputStream4 = JServlet.class.getResourceAsStream("/../../index.jsp");
        String ss = IOUtils.toString(inputStream4);
        System.out.println(ss);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
