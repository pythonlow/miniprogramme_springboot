package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Rating;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RatingService {

    List<Rating> getRatingByBid(int params);
    List<Rating> getRating(int params);
}
