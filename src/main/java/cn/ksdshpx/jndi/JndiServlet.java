package cn.ksdshpx.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/8/27
 * Time: 13:29
 * Description:
 */
public class JndiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Context initCxt = new InitialContext();
            DataSource dataSource = (DataSource) initCxt.lookup("java:comp/env/jdbc/c3p0");
            Connection conn = dataSource.getConnection();
            System.out.println(conn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
