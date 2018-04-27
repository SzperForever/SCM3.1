package com.jabil.service.Users;

import com.jabil.mapper.UsersMapper;
import com.jabil.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UsersMapper usersMapper;
    @Override
    public List<Users> findAllUsers() {
        return usersMapper.selectAll();
    }
}
