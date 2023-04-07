package com.shamengxin;

import com.shamengxin.entity.User;
import com.shamengxin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testDelete(){
        userService.delete("5");
    }

    @Test
    public void testSave(){
        User user = new User();
        user.setName("张三");
        user.setBir(new Date());
        user.setSex("男");
        user.setAddress("上海虹桥");
        userService.save(user);
    }

    @Test
    public void testFindAll(){
        userService.finAll().forEach(user -> System.out.println("user="+user));
    }
}
