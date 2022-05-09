package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.ShoppingcarMapper;
import com.example.miniprogramme_springboot.domain.Shoppingcar;
import com.example.miniprogramme_springboot.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShoppingcarServiceimpl implements ShoppingcarService {

    @Autowired
    private ShoppingcarMapper shoppingcarMapper;

    @Override
    public List<Shoppingcar> getshoppingcar(){
        return shoppingcarMapper.getshoppingcar();
    }

    @Override
    public Integer getrecommendBook(Map<Integer,Double> simList) {
        return shoppingcarMapper.getrecommendBook(simList);
    }

    public Integer insertshoppingcar(int params) {
        return shoppingcarMapper.insertshoppingcar(params);
    }

    public Integer updateshoppingcar(int params1, int params2) {
        return  shoppingcarMapper.updateshoppingcar(params1,params2);
    }

    public Integer deleteshoppingcar(int params) {
        return shoppingcarMapper.deleteshoppingcar(params);
    }


//    @Override
//    public List<Shoppingcar> recommendBook() { return shoppingcarMapper.recommendBook();
//    }
}
