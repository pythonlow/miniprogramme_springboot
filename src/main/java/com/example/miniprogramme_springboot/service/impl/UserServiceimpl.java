package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.BooksMapper;
import com.example.miniprogramme_springboot.dao.UserMapper;
import com.example.miniprogramme_springboot.domain.User;
import com.example.miniprogramme_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserWithPager(int pagenum, int pagesize) {
        return userMapper.getUserWithPager(pagenum,pagesize);
    }

    public List<User> getUserRank() {
        return userMapper.getUserRank();
    }
}
