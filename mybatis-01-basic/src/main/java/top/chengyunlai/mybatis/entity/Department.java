package top.chengyunlai.mybatis.entity;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Department {
    private String id;

    private String name;

    private String tel;

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    // getter setter toString equals hashcode
}
