package cn.ksdshpx.commons;

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
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(CommonUtils.uuid());
    }
}
