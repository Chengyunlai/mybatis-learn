package top.chengyunlai.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.chengyunlai.mybatis.dao.DepartmentDao;
import top.chengyunlai.mybatis.dao.impl.DepartmentDaoImpl;
import top.chengyunlai.mybatis.entity.Department;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class MyBatisApplication2 {
    public static void main(String[] args) throws IOException {
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);

        DepartmentDao departmentDao = new DepartmentDaoImpl(sqlSessionFactory);
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);
    }
}
