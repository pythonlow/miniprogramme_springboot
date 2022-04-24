package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.service.impl.BookServiceimpl;
import com.example.miniprogramme_springboot.service.impl.BooksServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class BooksController {
    @Autowired
    private BooksServiceimpl booksService;

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    private Object getBook() {
        return booksService.getBook();
    }
}
