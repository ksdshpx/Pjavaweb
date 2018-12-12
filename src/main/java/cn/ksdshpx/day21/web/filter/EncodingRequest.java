package cn.ksdshpx.day21.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/12
 * Time: 14:27
 * Description:增强HttpServletRequest
 */
public class EncodingRequest extends HttpServletRequestWrapper{
    private HttpServletRequest request;
    public EncodingRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }

    @Override
    public String getParameter(String name) {
        String value = request.getParameter(name);
        try {
            value = new String(value.getBytes("iso-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }
}
