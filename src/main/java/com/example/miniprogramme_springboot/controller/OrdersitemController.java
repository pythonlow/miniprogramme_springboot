package com.example.miniprogramme_springboot.controller;


import com.example.miniprogramme_springboot.service.impl.OrdersServiceimpl;
import com.example.miniprogramme_springboot.service.impl.OrdersitemServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class OrdersitemController {
    @Autowired
    private OrdersitemServiceimpl ordersitemService;

    @RequestMapping(value = "getordersitembyid",method = RequestMethod.GET)
    public Object getordersitembyid(@RequestParam(value = "params")int params){
        return ordersitemService.getordersitembyid(params);
    }

    @RequestMapping(value = "getordersitemrank",method = RequestMethod.GET)
    public Object getordersitemrank(){
        return ordersitemService.getordersitemrank();
    }
}
