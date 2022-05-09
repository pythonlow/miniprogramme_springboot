package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUserWithPager(int pagenum, int pagesize);
}
