package com.example.miniprogramme_springboot.controller;

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

}
