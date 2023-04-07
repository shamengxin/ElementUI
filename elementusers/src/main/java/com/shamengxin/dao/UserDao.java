package com.shamengxin.dao;

import com.shamengxin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    //查询所有用户信息
    List<User> findAll();

    /**
     * 保存用户信息
     * @param user
     */
    void save(User user);

    /**
     * 根据id删除用户
     */
    void delete(String id);

    /**
     * 根据id修改用户
     * @param user
     */
    void update(User user);

    //分页查询
    List<User> findByPage(@Param("start")Integer start,@Param("rows") Integer rows);

    //查询总条数
    Long findTotals();
}
