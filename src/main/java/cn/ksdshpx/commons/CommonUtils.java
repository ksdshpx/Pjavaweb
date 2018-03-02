package cn.ksdshpx.commons;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;
import java.util.UUID;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/2/11
 * Time: 17:05
 * Description:公共的工具类
 */
public class CommonUtils {
    //产生32位随机的不重复的字符串
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    //将map的数据封装进javabean并返回
    public static <T> T toBean(Map map, Class<T> clazz) {
        try {
            T bean = clazz.newInstance();
            BeanUtils.populate(bean, map);
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(CommonUtils.uuid());
    }
}
