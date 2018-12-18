package cn.ksdshpx.pagestatic.filter;

import cn.ksdshpx.pagestatic.util.PageStaticResponse;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/18
 * Time: 13:00
 * Description:
 */
public class PageStaticFilter implements Filter {
    private FilterConfig config;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String htmlPath = config.getServletContext().getRealPath("statichtmls");
        String htmlName = request.getParameter("category") + ".html";
        File file = new File(htmlPath, htmlName);
        if (file.exists()) {
            response.sendRedirect(request.getContextPath() + "/statichtmls/" + htmlName);
            return;
        }
        PageStaticResponse psp = new PageStaticResponse(response,file.getAbsolutePath());
        chain.doFilter(request, psp);
        response.sendRedirect(request.getContextPath() + "/statichtmls/" + htmlName);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}
