package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.service.impl.BookServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class BookController {

    @Autowired
    private BookServiceimpl bookService;

    @RequestMapping(value = "/allBook", method = RequestMethod.GET)
    private Object allBook() {
        return bookService.allBook();
    }
}
