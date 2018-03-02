package cn.ksdshpx.introspector;

import cn.ksdshpx.commons.CommonUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/3/2
 * Time: 15:29
 * Description:内省机制与BeanUtils工具类
 * 内省底层依赖于反射机制，它就是通过反射来操作javabean,就是比反射操作方便！
 * CommonUtils --> BeanUtils --> 内省 -->反射
 */
public class IntrospectorDemo {
    /**
     * 通过内省操作javabean
     */
    @Test
    public void test() throws Exception {
        String className = "cn.ksdshpx.introspector.User";
        Class clazz = Class.forName(className);
        User user = (User) clazz.newInstance();
        BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null && "setName".equals(writeMethod.getName())) {
                writeMethod.invoke(user,"zhangsan");
            }
            if (writeMethod != null && "setAge".equals(writeMethod.getName())) {
                writeMethod.invoke(user,30);
            }
        }
        System.out.println(user);
    }

    /**
     * 通过BeanUtils操作javabean
     */
    @Test
    public void test2() throws Exception {
        String className = "cn.ksdshpx.introspector.User";
        Class clazz = Class.forName(className);
        User user = (User) clazz.newInstance();
        BeanUtils.setProperty(user,"name","zhangsan");
        BeanUtils.setProperty(user,"age",90);
        System.out.println("name"+BeanUtils.getProperty(user,"name"));
        System.out.println(user);
    }

    /**
     * 通过BeanUtils将map中的数据封装进javabean
     */
    @Test
    public void test3() throws Exception {
        String className = "cn.ksdshpx.introspector.User";
        Class clazz = Class.forName(className);
        User user = (User) clazz.newInstance();
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","666");
        BeanUtils.populate(user,map);
        System.out.println(user);
    }

    /**
     * 封装CommonUtils类，完成将map中的数据封装进javabean
     */
    @Test
    public void test4() throws Exception {
        String className = "cn.ksdshpx.introspector.User";
        Class clazz = Class.forName(className);
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","666");
        User user = (User)CommonUtils.toBean(map,clazz);
        System.out.println(user);
    }
}
