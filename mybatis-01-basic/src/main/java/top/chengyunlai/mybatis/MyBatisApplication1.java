package top.chengyunlai.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
public class MyBatisApplication1 {
    public static void main(String[] args) throws IOException {
        // InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        // SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(xml);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Department> departmentList = sqlSession.selectList("departmentMapper.findAll");
        departmentList.forEach(System.out::println);
    }
}
