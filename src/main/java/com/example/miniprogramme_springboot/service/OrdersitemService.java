package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Ordersitem;

import java.util.List;

public interface OrdersitemService {
    List<Ordersitem> getordersitembyid(int params);
}
