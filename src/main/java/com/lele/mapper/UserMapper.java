package com.lele.mapper;


import com.lele.entity.User;


public interface UserMapper {

    public boolean insertUser(User user);

    public User queryUserById(int id);

}
