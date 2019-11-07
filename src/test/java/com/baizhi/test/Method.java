package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Method {
    @Autowired
    private UserService userService;

    @Test
    public void method(){
        List<User> users = userService.showAllUser(1, 4);
        System.out.println(users+"-----");
    }
}
