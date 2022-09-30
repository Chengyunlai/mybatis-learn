package top.chengyunlai.mybatis.mapper;

import top.chengyunlai.mybatis.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
