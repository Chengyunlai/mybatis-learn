package top.chengyunlai.mybatis.configuration.entity;

import java.util.Set;

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

    // Department 要对 User 一对多
    // 查出 部门 的同时，把用户信息也拉出来
    private Set<User> users;

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", users=" + users +
                '}';
    }

// getter setter toString equals hashcode
}
