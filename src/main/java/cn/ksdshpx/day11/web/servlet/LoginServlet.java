package cn.ksdshpx.day11.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/2/11
 * Time: 15:36
 * Description:登录案例
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决post请求的中文乱码问题
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //1.获取表单参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String paramCode = request.getParameter("vcode");
        String sessionCode = (String) request.getSession().getAttribute("sessionCode");
        if(!paramCode.equalsIgnoreCase(sessionCode)){
            request.setAttribute("msg","验证码错误！");
            request.getRequestDispatcher("/session/login.jsp").forward(request,response);
            return;
        }
        //2.判断参数是否正确
        if ("ksdshpx".equals(username) && "123".equals(password)) {//登录成功
            //保存用户名到客户端浏览器
            Cookie cookie = new Cookie("uname",username);
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            //保存用户名到session中
            request.getSession().setAttribute("username", username);
            //重定向到succ1.jsp
            response.sendRedirect(request.getContextPath() + "/session/succ1.jsp");
        } else {//登录失败
            //保存错误信息到request域中
            request.setAttribute("msg", "用户名或密码错误");
            //转发到login.jsp
            request.getRequestDispatcher("/session/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
