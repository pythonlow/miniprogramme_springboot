package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.dao.UserMapper;
import com.example.miniprogramme_springboot.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {
    @Autowired
    private UserServiceimpl userService;

    @RequestMapping(value = "/getUserWithPager",method = RequestMethod.GET)
    public Object getUserWithPager(String pageNum,String pageSize){
        Integer pagenum = Integer.parseInt(pageNum);
        Integer pagesize = Integer.parseInt(pageSize);
        return userService.getUserWithPager(pagenum,pagesize);
    }

    @RequestMapping(value = "getUserRank",method = RequestMethod.GET)
    public Object getUserRank(){
        return userService.getUserRank();
    }
}
