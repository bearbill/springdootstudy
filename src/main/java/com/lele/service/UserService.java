package com.lele.service;

import com.lele.entity.User;
import com.lele.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public class UserService {


    private UserMapper usermapper;
    public boolean insertUser(User user)
    {
        return usermapper.insertUser(user);
    }

    public User queryUserById(int id)
    {
        return usermapper.queryUserById(id);
    }
}
