package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.OrdersMapper;
import com.example.miniprogramme_springboot.dao.OrdersitemMapper;
import com.example.miniprogramme_springboot.domain.Ordersitem;
import com.example.miniprogramme_springboot.service.OrdersService;
import com.example.miniprogramme_springboot.service.OrdersitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersitemServiceimpl implements OrdersitemService {
    @Autowired
    private OrdersitemMapper ordersitemMapper;

    @Override
    public List<Ordersitem> getordersitembyid(int params) {
        return ordersitemMapper.getordersitembyid(params);
    }
}
