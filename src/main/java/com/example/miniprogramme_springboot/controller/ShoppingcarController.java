package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.service.impl.BookServiceimpl;
import com.example.miniprogramme_springboot.service.impl.ShoppingcarServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ShoppingcarController {
    @Autowired
    private ShoppingcarServiceimpl shoppingService;

    @RequestMapping(value = "/getshoppingcar", method = RequestMethod.GET)
    private Object getshoppingcar() {
        return shoppingService.getshoppingcar();
    }
}
