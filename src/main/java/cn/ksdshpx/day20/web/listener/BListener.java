package cn.ksdshpx.day20.web.listener;
/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/10/6
 * Time: 14:15
 * Description:属性监听器
 */

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class BListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        System.out.println("往ServletContext中添加了名为" + scab.getName() + ",值为" + scab.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        System.out.println("从ServletContext中删除了名为" + scab.getName() + ",值为" + scab.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        System.out.println("将ServletContext中名为" + scab.getName() + "值为" + scab.getValue() + "修改为" + scab.getServletContext().getAttribute(scab.getName()));
    }
}
