package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.UsercfRecommendMapper;
import com.example.miniprogramme_springboot.domain.UsercfRecommend;
import com.example.miniprogramme_springboot.service.UsercfRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UsercfRecommendServiceimpl implements UsercfRecommendService {
    @Autowired
    private UsercfRecommendMapper usercfRecommendMapper;

    @Override
    public List<UsercfRecommend> getUsercf(){
        return usercfRecommendMapper.getUsercf();
    }

    public Integer insertUsercf(Map<Long, Float> simList) {
        return usercfRecommendMapper.insertUsercf(simList);
    }
}
