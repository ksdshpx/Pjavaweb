package cn.ksdshpx.pagestatic.domain;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/12/17
 * Time: 11:16
 * Description:页面静态化之Book类
 */
public class Book {
    private String bid;
    private String bname;
    private Double price;
    private Integer category;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
