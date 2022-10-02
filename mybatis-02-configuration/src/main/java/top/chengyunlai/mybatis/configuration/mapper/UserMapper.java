package top.chengyunlai.mybatis.configuration.mapper;

import top.chengyunlai.mybatis.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();

    List<User> findAllLazy();

    List<User> findAllUseTypeHandler();

    void saveUser(User user);

    List<User> findAllByDepartmentIdMysql(String s);
}
