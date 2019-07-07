package cn.ksdshpx.day22.web.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/7
 * Time: 15:48
 * Description:演示文件上传
 */
public class Upload2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        /*
         * 上传三步
         *  1.得到工厂
         *  2.通过工厂得到解析器
         *  3.解析request得到FileItem集合
         *  4.遍历FileItem集合，调用其API完成文件的保存
         */
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            FileItem fileItem1 = fileItems.get(0);
            System.out.println("普通表单项演示:" + fileItem1.getFieldName() + "=" + fileItem1.getString("UTF-8"));
            FileItem fileItem2 = fileItems.get(1);
            System.out.println("文件表单项演示");
            System.out.println("Content-Type:" + fileItem2.getContentType());
            System.out.println("Size:" + fileItem2.getSize());
            System.out.println("FileName:" + fileItem2.getName());
            //保存文件
            File descFile = new File("d:\\aaa.jpg");
            fileItem2.write(descFile);
        } catch (FileUploadException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
