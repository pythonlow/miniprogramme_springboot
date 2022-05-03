package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Favorites;

import java.util.List;

public interface FavoritesService {
    List<Favorites> getfavorites(int params);
    List <Favorites>getislike(Integer bid1, Integer uid1);
    Integer insertfavorites(Integer bid1, Integer uid1);
}
