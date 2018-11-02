package cn.ksdshpx.day21.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/11/2
 * Time: 8:54
 * Description:
 */
public class UserFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String username = (String) request.getSession().getAttribute("username");
        if (username == null) {
            request.setAttribute("errorMsg", "您只是游客！！！");
            request.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
