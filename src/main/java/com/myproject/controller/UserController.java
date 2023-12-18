package com.myproject.controller;



import com.myproject.entity.User;
import com.myproject.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author haruki
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/sel")
    public List<User> function(){
        return userService.selUser();
    }

    @PostMapping("/redis")
    public String redis() {
        Jedis jedis = new Jedis("192.168.137.173",16379);
        jedis.auth("7355608");
        String ping = jedis.ping();
        jedis.close();
        return ping;
    }


}
