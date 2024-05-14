package com.shuyu.examplespringbootprovider;

import com.shuyu.example.common.model.User;
import com.shuyu.example.common.service.UserService;
import com.shuyu.Shuyurpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类  
 */
@Service
@RpcService
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
