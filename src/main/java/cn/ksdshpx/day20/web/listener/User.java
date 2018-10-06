package cn.ksdshpx.day20.web.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/10/6
 * Time: 14:41
 * Description:HttpSessionBandingListener监听器
 *             HttpSessionBandingListener特点：1.添加到JavaBean上
 *                                            2.无需在web.xml中注册
 */
public class User implements HttpSessionBindingListener{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("哇~，session添加了我！");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("呜呜呜~，无情的session抛弃了我！");
    }
}
