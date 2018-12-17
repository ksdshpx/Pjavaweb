package cn.ksdshpx.pagestatic.dao;

import cn.itcast.jdbc.TxQueryRunner;
import cn.ksdshpx.pagestatic.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/17
 * Time: 11:18
 * Description:页面静态化之BookDao
 */
public class BookDao {
    private QueryRunner qr = new TxQueryRunner();

    public List<Book> findAll() {
        List<Book> bookList;
        try {
            String sql = "select * from t_book";
            bookList = qr.query(sql, new BeanListHandler<Book>(Book.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }

    public List<Book> findByCategory(Integer category) {
        List<Book> bookList;
        try {
            String sql = "select * from t_book t where t.category = ?";
            bookList = qr.query(sql, new BeanListHandler<Book>(Book.class), category);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }
}
