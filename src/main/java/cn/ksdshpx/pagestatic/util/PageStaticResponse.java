package cn.ksdshpx.pagestatic.util;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/18
 * Time: 13:19
 * Description:增强HttpServletResponse
 */
public class PageStaticResponse extends HttpServletResponseWrapper {
    private PrintWriter printWriter;

    public PageStaticResponse(HttpServletResponse response, String fileName) throws IOException {
        super(response);
        this.printWriter = new PrintWriter(fileName,"UTF-8");
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return this.printWriter;
    }
}
