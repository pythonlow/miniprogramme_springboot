package com.example.miniprogramme_springboot.service;


import com.example.miniprogramme_springboot.domain.Shoppingcar;

import java.util.List;
import java.util.Map;

public interface ShoppingcarService {
    List<Shoppingcar> getshoppingcar();

//    List<Shoppingcar> recommendBook();
//    Map<Integer,Double> getrecommendBook();

    Integer getrecommendBook(Map<Integer, Double> simList);
}
