package cn.ksdshpx.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/4/13
 * Time: 13:59
 * Description:自定义标签处理类
 */
public class MyTag3 extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        Writer out = this.getJspContext().getOut();
        out.write("******************<br/>");
        this.getJspBody().invoke(out);
        out.write("<br/>******************");
    }
}
