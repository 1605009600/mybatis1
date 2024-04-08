package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        InputStream inputStream  = Resource.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper  = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);
         userMapper.into();
        List<User> users1 = userMapper.selectAll();
        System.out.println(users1);
        userMapper.updateuser();
        List<User> users2 = userMapper.selectAll();
        System.out.println(users2);
        userMapper.deleteuser();
        List<User> users3= userMapper.selectAll();
        System.out.println(users3);
    }

}
