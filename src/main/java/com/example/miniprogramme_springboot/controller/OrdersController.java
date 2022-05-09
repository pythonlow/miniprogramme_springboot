package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.dao.OrdersMapper;
import com.example.miniprogramme_springboot.service.impl.OrdersServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class OrdersController {
    @Autowired
    private OrdersServiceimpl ordersServiceimpl;

    @RequestMapping(value = "getordersbyuid",method = RequestMethod.GET)
    public Object getordersbyuid(@RequestParam(value = "params") int params){
        return ordersServiceimpl.getordersbyuid(params);
    }

    @RequestMapping(value = "getorders" ,method = RequestMethod.GET)
    public Object getorders(){
        return ordersServiceimpl.getorders();
    }

    @RequestMapping(value = "backorders",method = RequestMethod.GET)
    public Object backorders(@RequestParam(value = "params")int params){
        return ordersServiceimpl.backorders(params);}

    @RequestMapping(value = "checkorders",method = RequestMethod.GET)
    public Object checkorders(@RequestParam(value = "params")int params){
        return ordersServiceimpl.checkorders(params);
    }

    @RequestMapping(value = "insertorders",method = RequestMethod.GET)
    public Object insertorders(){
        return ordersServiceimpl.insertorders();
    }

//    @RequestMapping(value = "getordersrank",method = RequestMethod.GET)
//    public Object getordersrank(){return ordersServiceimpl.getordersrank();}
}
