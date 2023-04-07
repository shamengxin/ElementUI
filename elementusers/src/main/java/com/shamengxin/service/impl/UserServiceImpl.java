package com.shamengxin.service.impl;

import com.shamengxin.dao.UserDao;
import com.shamengxin.entity.User;
import com.shamengxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> finAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> findByPage(Integer pageNow, Integer rows) {
        int start = (pageNow-1)*rows;
        return userDao.findByPage(start,rows);
    }

    @Override
    public Long findTotals() {
        return userDao.findTotals();
    }
}
