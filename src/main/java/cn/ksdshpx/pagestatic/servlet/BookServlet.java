package cn.ksdshpx.pagestatic.servlet;

import cn.itcast.servlet.BaseServlet;
import cn.ksdshpx.pagestatic.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/17
 * Time: 11:10
 * Description:页面静态化之BookServlet类
 */
public class BookServlet extends BaseServlet {
    private BookDao bookDao = new BookDao();

    public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("beanList", bookDao.findAll());
        return "/pagestatic/show.jsp";
    }

    public String findByCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer category = Integer.parseInt(request.getParameter("category"));
        request.setAttribute("beanList", bookDao.findByCategory(category));
        return "/pagestatic/show.jsp";
    }
}
