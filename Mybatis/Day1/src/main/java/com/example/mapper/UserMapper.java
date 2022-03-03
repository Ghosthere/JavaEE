package com.example.mapper;

import com.example.mapper.pojo.User;

import java.util.List;

/**
 * @Author: zhang
 * @Discription:
 * @Date: Created in 21:54 2022/3/2
 */
public interface  UserMapper {

    int insertUser();

    User selectOne();

    List<User> selectAll(Integer id);

}
