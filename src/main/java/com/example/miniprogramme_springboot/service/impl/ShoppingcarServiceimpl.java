package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.ShoppingcarMapper;
import com.example.miniprogramme_springboot.domain.Shoppingcar;
import com.example.miniprogramme_springboot.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingcarServiceimpl implements ShoppingcarService {

    @Autowired
    private ShoppingcarMapper shoppingcarMapper;

    @Override
    public List<Shoppingcar> getshoppingcar(){
        return shoppingcarMapper.getshoppingcar();
    }

//    @Override
//    public List<Shoppingcar> recommendBook() { return shoppingcarMapper.recommendBook();
//    }
}
