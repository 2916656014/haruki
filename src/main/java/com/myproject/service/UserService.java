package com.myproject.service;

import com.myproject.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author haruki
* @description 针对表【user】的数据库操作Service
* @createDate 2023-12-14 15:01:58
*/
public interface UserService extends IService<User> {

    List<User> selUser();
}
