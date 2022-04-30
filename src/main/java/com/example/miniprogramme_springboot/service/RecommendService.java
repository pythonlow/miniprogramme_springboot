package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.domain.Recommend;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RecommendService {
    @Autowired
    List<Recommend> getItemBC();


}
