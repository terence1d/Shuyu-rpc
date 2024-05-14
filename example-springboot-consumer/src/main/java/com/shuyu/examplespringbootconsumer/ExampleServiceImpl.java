package com.shuyu.examplespringbootconsumer;

import com.shuyu.example.common.model.User;
import com.shuyu.example.common.service.UserService;
import com.shuyu.Shuyurpc.springboot.starter.annotation.RpcReference;
import org.springframework.stereotype.Service;

/**
 * 示例服务实现类  
 */
@Service
public class ExampleServiceImpl {

    /**
     * 使用 Rpc 框架注入
     */
    @RpcReference
    private UserService userService;

    /**
     * 测试方法
     */
    public void test() {
        User user = new User();
        user.setName("shuyu");
        User resultUser = userService.getUser(user);
        System.out.println(resultUser.getName());
    }

}
