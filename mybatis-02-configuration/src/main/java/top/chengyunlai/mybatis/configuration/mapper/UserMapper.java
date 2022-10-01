package top.chengyunlai.mybatis.configuration.mapper;

import top.chengyunlai.mybatis.configuration.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();

    List<User> findAllLazy();
}
