package com.shamengxin.service;

import com.shamengxin.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {


    //查询所有方法
    List<User> finAll();

    void save(User user);

    void delete(String id);

    void update(User user);

    List<User> findByPage(Integer pageNow,Integer rows);

    //查询总条数
    Long findTotals();

}
