package com.example.miniprogramme_springboot.controller;


import com.example.miniprogramme_springboot.service.impl.BooksServiceimpl;
import com.example.miniprogramme_springboot.service.impl.RecommendServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class RecommendController {
    @Autowired
    private RecommendServiceimpl recommendService;

    @RequestMapping(value = "/getItemBC", method = RequestMethod.GET)
    public Object getItemBC() {
        return recommendService.getItemBC();
    }
}
