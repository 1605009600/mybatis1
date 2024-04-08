package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

List<User> selectAll();
void into();
void updateuser();
void deleteuser();
}
