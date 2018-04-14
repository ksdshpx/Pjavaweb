package cn.ksdshpx.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/4/13
 * Time: 11:13
 * Description:自定义标签处理类2
 */
public class MyTag2 extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        this.getJspContext().getOut().print("Hello Again!");
    }
}
