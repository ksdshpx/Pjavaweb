package cn.ksdshpx.domain;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/3/4
 * Time: 21:25
 * Description:雇员类
 */
public class Employee {
    private String name;
    private double saraly;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaraly() {
        return saraly;
    }

    public void setSaraly(double saraly) {
        this.saraly = saraly;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Employee(String name, double saraly, Address address) {
        this.name = name;
        this.saraly = saraly;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", saraly=" + saraly +
                ", address=" + address +
                '}';
    }
}
