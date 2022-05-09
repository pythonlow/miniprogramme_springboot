package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Orders;


import java.util.List;

public interface OrdersService {
    List<Orders> getordersbyuid(int params);
    List<Orders> getorders();
    Integer backorders(int params);
    Integer checkorders(int params);
}
