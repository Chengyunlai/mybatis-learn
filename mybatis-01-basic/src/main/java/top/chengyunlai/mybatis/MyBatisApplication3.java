package top.chengyunlai.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.chengyunlai.mybatis.basic.entity.Department;
import top.chengyunlai.mybatis.basic.mapper.DepartmentMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class MyBatisApplication3 {
    public static void main(String[] args) throws IOException {
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口的代理
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.findById("18ec781fbefd727923b0d35740b177ab");
        System.out.println(department);
    }
}
