package com.example.mapper;

import com.example.mapper.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: zhang
 * @Discription:
 * @Date: Created in 0:13 2022/3/3
 */
public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int i = userMapper.insertUser();
        System.out.println(i);

        User user = userMapper.selectOne();
        System.out.println(user);
    }

}