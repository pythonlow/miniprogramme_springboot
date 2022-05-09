package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.RatingMapper;
import com.example.miniprogramme_springboot.domain.Rating;
import com.example.miniprogramme_springboot.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceimpl implements RatingService {
    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public List<Rating> getRatingByBid(int params) {
//        System.out.println("impl"+params);
        return ratingMapper.getRatingByBid(params);
    }
    @Override
    public List<Rating> getRating(int params) {
        return ratingMapper.getRating(params);
    }

    public Integer insertRating(Integer score, Integer bid1, Integer uid1, String comments) {
        return ratingMapper.insertRating(score,bid1,uid1,comments);
    }

    public List<Rating> getRatingByUid(int params) {
        return ratingMapper.getRatingByUid(params);
    }

    public Integer deleteRating(int id) {
        return ratingMapper.deleteRating(id);
    }

    public List<Rating> getRatingWithPager(Integer pagenum, Integer pagesize) {
        return ratingMapper.getRatingWithPager(pagenum,pagesize);
    }

    public List<Rating> getRatingRank() {
        return ratingMapper.getRatingRank();
    }
}
