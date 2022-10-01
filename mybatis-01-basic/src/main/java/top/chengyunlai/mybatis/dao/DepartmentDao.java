package top.chengyunlai.mybatis.dao;

import top.chengyunlai.mybatis.basic.entity.Department;

import java.util.List;

/**
 * @ClassName
 * @Description 原始 Dao 开发的方式
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public interface DepartmentDao {
    List<Department> findAll();
    Department findById(String id);
}
