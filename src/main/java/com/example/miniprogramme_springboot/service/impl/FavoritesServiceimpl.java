package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.FavoritesMapper;
import com.example.miniprogramme_springboot.domain.Favorites;
import com.example.miniprogramme_springboot.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesServiceimpl implements FavoritesService {
    @Autowired
    private FavoritesMapper favoritesMapper;

    @Override
    public List<Favorites> getfavorites(int params) {
        return favoritesMapper.getfavorites(params);
    }
    @Override
    public List<Favorites> getislike(Integer bid1, Integer uid1) {
        return favoritesMapper.getislike(bid1,uid1);
    }
    @Override
    public Integer insertfavorites(Integer bid1, Integer uid1) {
        return favoritesMapper.insertfavorites(bid1,uid1);
    }

    public Integer deletefavorites(Integer bid1, Integer uid1) {
        return favoritesMapper.deletefavorites(bid1,uid1);
    }
}
