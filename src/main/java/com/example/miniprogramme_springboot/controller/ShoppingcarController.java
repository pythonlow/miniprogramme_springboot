package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.recommend.ItemCB_1;
import com.example.miniprogramme_springboot.service.impl.ShoppingcarServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@Controller
public class ShoppingcarController {
    @Autowired
    private ShoppingcarServiceimpl shoppingcarService;

    @RequestMapping(value = "/getshoppingcar", method = RequestMethod.GET)
    private Object getshoppingcar() {
        return shoppingcarService.getshoppingcar();
    }

    @RequestMapping(value = "recommendBook",method = RequestMethod.GET)
    public Integer recommendBook(@RequestParam("params") int [] params) {
        ItemCB_1 cb = new ItemCB_1();
        Map<Integer,Double>simList= cb.getItemCB(params);
        System.out.println(simList);
        return shoppingcarService.getrecommendBook(simList);

    }



}
