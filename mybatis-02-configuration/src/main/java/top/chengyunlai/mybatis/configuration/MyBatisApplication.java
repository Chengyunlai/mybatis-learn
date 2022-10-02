package top.chengyunlai.mybatis.configuration;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.chengyunlai.mybatis.configuration.mapper.UserMapper;
import top.chengyunlai.mybatis.entity.Department;
import top.chengyunlai.mybatis.entity.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class MyBatisApplication {
    public static void main(String[] args) {
        try {
            InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.findAllUseTypeHandler();
            // userList.forEach(System.out::println);

            // User user = new User();
            // user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            // user.setName("hahahaha");
            // Department department = new Department();
            // department.setId("18ec781fbefd727923b0d35740b177ab");
            // user.setDepartment(department);
            // userMapper.saveUser(user);
            //
            // // commit才能使数据库操作生效
            // sqlSession.commit();
            // sqlSession.close();
            List<User> userList2 = userMapper.findAllByDepartmentIdMysql("18ec781fbefd727923b0d35740b177ab");
            userList2.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
