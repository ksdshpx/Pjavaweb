package cn.ksdshpx.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/4/13
 * Time: 11:04
 * Description:自定义标签处理类
 */
public class MyTag1 implements SimpleTag{
    private PageContext pageContext;
    private JspFragment body;
    @Override
    public void doTag() throws JspException, IOException {
        pageContext.getOut().print("Hello Tag!");
    }

    @Override
    public void setParent(JspTag jspTag) {

    }

    @Override
    public JspTag getParent() {
        return null;
    }

    @Override
    public void setJspContext(JspContext jspContext) {
        this.pageContext = (PageContext) jspContext;
    }

    @Override
    public void setJspBody(JspFragment jspFragment) {
        this.body = jspFragment;
    }
}
