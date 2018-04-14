package cn.ksdshpx.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/4/14
 * Time: 9:12
 * Description:带属性的标签处理类
 */
public class MyTag5 extends SimpleTagSupport {
    private boolean test;

    /**
     * 该方法由Tomcat调用，在doTag()之前
     *
     * @param test
     */
    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (test) {
            this.getJspBody().invoke(null);//传递null,相当于使用当前页面的out，与传递this.getJspContext().getOut()相同
        }
    }
}
