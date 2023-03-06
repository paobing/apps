package com.paobing.controller;

import com.paobing.domain.UserInfo;
import com.paobing.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest、Request是spring-web-start提供的
 * Restful风格开发接口
 */
@RestController
@RequestMapping("/users")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    private UserInfo userInfo;

    /**
     * 从路径中获取参数
     */
    @GetMapping("{id}")
    public UserInfo getById(@PathVariable Integer id){
        return userInfoService.getById(id);
    }

    @GetMapping
    public List<UserInfo> getAll(){
        return userInfoService.getAll();
    }

    /**
     * 从body中获取参数
     */
    @PostMapping
    public Boolean save(@RequestBody UserInfo userInfo){
        return userInfoService.save(userInfo);
    }

    @PutMapping
    public Boolean update(@RequestBody UserInfo userInfo){
        return  userInfoService.update(userInfo);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return userInfoService.delete(id);
    }
}
