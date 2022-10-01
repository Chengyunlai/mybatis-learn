package top.chengyunlai.mybatis.basic.mapper;

import top.chengyunlai.mybatis.basic.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();

    List<User> findAllLazy();
}
