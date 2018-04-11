package cn.ksdshpx.velocity;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/4/11
 * Time: 13:59
 * Description:Velocity模板技术Demo
 */
public class HelloVelocity {
    public static void main(String[] args) {
        //初始化模板引擎
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        //获取模板文件
        Template template = velocityEngine.getTemplate("hellovelocity.vm");
        //设置变量
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name","Velocity");
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        velocityContext.put("list",list);
        //输出
        StringWriter stringWriter = new StringWriter();
        template.merge(velocityContext,stringWriter);
        System.out.println(stringWriter.toString());
    }
}
