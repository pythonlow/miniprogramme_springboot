package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.domain.Rating;
import com.example.miniprogramme_springboot.service.RatingService;
import com.example.miniprogramme_springboot.service.impl.BooksServiceimpl;
import com.example.miniprogramme_springboot.service.impl.RatingServiceimpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class RatingController {
    @Autowired
    private RatingServiceimpl ratingService;

    @RequestMapping(value = "/getRatingByBid")
    public Object getRatingByBid (@RequestParam("params")int params){
//        System.out.println("controller"+params);
        return ratingService.getRatingByBid(params);
    }

    @RequestMapping(value = "/getRating")
    public Object getRating(@RequestParam("params") int params){
        return ratingService.getRating(params);
    }

    @RequestMapping(value = "/insertRating")
    public Object insertRating(String rating,String bid,String comments,String uid){
        Integer score=Integer.parseInt(rating);
        Integer bid1 = Integer.parseInt(bid);
        Integer uid1 = Integer.parseInt(uid);
        return ratingService.insertRating(score,bid1,uid1,comments);
//        System.out.println(rating+bid+comments+uid);
    }
    @RequestMapping(value = "/getRatingByUid")
    public Object getRatingByUid (@RequestParam("params")int params){
        return ratingService.getRatingByUid(params);
    }

    @RequestMapping(value = "/deleteRating")
    public Object deleteRating(@RequestParam("id") int id){
        return ratingService.deleteRating(id);
    }

    @RequestMapping(value = "/getRatingWithPager")
    public Object getRatingWithPager(String pageNum,String pageSize){
        Integer pagenum = Integer.parseInt(pageNum);
        Integer pagesize = Integer.parseInt(pageSize);
        return ratingService.getRatingWithPager(pagenum,pagesize);
    }

    @RequestMapping(value = "getRatingRank")
    public Object getRatingRank(){
        return ratingService.getRatingRank();
    }
}
