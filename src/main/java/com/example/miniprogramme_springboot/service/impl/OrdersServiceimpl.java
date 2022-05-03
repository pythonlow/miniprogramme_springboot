package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.OrdersMapper;
import com.example.miniprogramme_springboot.domain.Orders;
import com.example.miniprogramme_springboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceimpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> getordersbyuid(int params) {
        return ordersMapper.getordersbyuid(params);
    }
    @Override
    public List<Orders> getorders() {
        return ordersMapper.getorders();
    }
}
