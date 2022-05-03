package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Ordersitem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersitemMapper {

    int insert(Ordersitem record);

    int insertSelective(Ordersitem record);

    List getordersitembyid(@Param(value = "orderid") int params);
}