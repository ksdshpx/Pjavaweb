package cn.ksdshpx.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/4/13
 * Time: 14:47
 * Description:自定义标签处理类
 */
public class MyTag4 extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        this.getJspContext().getOut().print("我下面的都不执行");
        throw new SkipPageException();
    }
}
