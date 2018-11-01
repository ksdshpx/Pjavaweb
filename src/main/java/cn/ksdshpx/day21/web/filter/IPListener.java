package cn.ksdshpx.day21.web.filter; /**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/11/1
 * Time: 8:47
 * Description:分IP统计访问次数
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

public class IPListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        Map<String, Integer> map = new HashMap<>();
        sce.getServletContext().setAttribute("map", map);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
