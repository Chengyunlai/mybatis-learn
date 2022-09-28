package top.chengyunlai.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.chengyunlai.mybatis.dao.DepartmentDao;
import top.chengyunlai.mybatis.entity.Department;

import java.util.List;

/**
 * @ClassName
 * @Description 通常情况下一个工程在运行期只允许存在一个 SqlSessionFactory，这就想到了Spring了吧
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DepartmentDaoImpl implements DepartmentDao {
    private SqlSessionFactory sqlSessionFactory;

    public DepartmentDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<Department> findAll() {
        // TIPS： try-with-resource 的方式，可以省略 sqlSession.close(); 的代码。
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectList("departmentMapper.findAll");
        }
    }

    @Override
    public Department findById(String id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectOne("departmentMapper.findById", id);
        }
    }
}
