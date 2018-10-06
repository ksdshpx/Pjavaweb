package cn.ksdshpx.day20.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/10/5
 * Time: 15:39
 * Description:ServletContext监听器
 */
public class AListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("出生之后调用...contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("临死之前调用...contextDestroyed");
    }
}
