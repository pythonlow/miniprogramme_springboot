package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.BooksMapper;
import com.example.miniprogramme_springboot.dao.RecommendMapper;
import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.domain.Recommend;
import com.example.miniprogramme_springboot.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendServiceimpl implements RecommendService {
    @Autowired
    private RecommendMapper recommendMapper;

    @Override
    public List<Recommend> getItemBC(){
        return recommendMapper.getItemBC();
    }
}
