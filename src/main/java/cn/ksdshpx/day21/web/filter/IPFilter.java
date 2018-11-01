package cn.ksdshpx.day21.web.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/11/1
 * Time: 8:52
 * Description:过滤器的应用：分IP统计访问次数
 */
public class IPFilter implements Filter {
    private FilterConfig config;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String ip = req.getRemoteAddr();
        ServletContext application = config.getServletContext();
        Map<String, Integer> map = (Map) application.getAttribute("map");
        if (map.get(ip) == null) {
            map.put(ip, 1);
        } else {
            map.put(ip, map.get(ip) + 1);
        }
        application.setAttribute("map", map);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}
