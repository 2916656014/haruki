package com.myproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myproject.entity.User;
import com.myproject.service.UserService;
import com.myproject.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author haruki
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-12-14 15:01:58
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selUser(){
        return userMapper.selUser();
    }
}




