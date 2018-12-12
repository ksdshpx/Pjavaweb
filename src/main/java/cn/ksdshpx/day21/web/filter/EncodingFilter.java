package cn.ksdshpx.day21.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/12
 * Time: 13:46
 * Description:
 */
public class EncodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        //处理post请求的编码问题
        request.setCharacterEncoding("utf-8");
        //处理get请求编码问题
        if(request.getMethod().equals("GET")){
            EncodingRequest er = new EncodingRequest(request);
            chain.doFilter(er, resp);
        }
        chain.doFilter(request, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
