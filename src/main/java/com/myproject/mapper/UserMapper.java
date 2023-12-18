package com.myproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myproject.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author haruki
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-12-14 15:01:58
* @Entity com.myproject.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selUser();
}




