package com.shamengxin.controller;

import com.shamengxin.entity.User;
import com.shamengxin.service.UserService;
import com.shamengxin.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findByPage")
    public Map<String, Object> findByPage(Integer pageNow,Integer pageSize){
        Map<String,Object> map = new HashMap<>();
        pageNow=pageNow==null?1:pageNow;
        pageSize=pageSize==null?4:pageSize;
        List<User> users = userService.findByPage(pageNow, pageSize);
        Long totals = userService.findTotals();
        map.put("users",users);
        map.put("total",totals);
        return map;
    }

    @GetMapping("delete")
    public Result delete(String id){
        Result result = new Result();
        try{
            userService.delete(id);
            result.setMsg("删除用户信息成功！！！");
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("删除用户信息失败，请稍后再试！！！");
        }
        return result;
    }

    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody User user){
        Result result = new Result();
        try {
            if(StringUtils.isEmpty(user.getId())){
                userService.save(user);
                result.setMsg("用户信息保存成功！！！！");
            }else {
                userService.update(user);
                result.setMsg("用户信息修改成功！！！！");
            }
        }catch (Exception e){
            result.setStatus(false);
            result.setMsg("系统错误：用户信息保存失败，请稍后再试！！！！");
        }
        return result;
    }

    @GetMapping("findAll")
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll(){
        return userService.finAll();
    }

}
