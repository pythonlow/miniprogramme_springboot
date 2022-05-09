package com.example.miniprogramme_springboot.controller;


import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.recommend.ExtractData_1;
import com.example.miniprogramme_springboot.recommend.ItemCB_1;
import com.example.miniprogramme_springboot.recommend.UserCF_1;
import com.example.miniprogramme_springboot.service.impl.BooksServiceimpl;
import org.apache.mahout.cf.taste.common.TasteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;


@RestController
@Controller
public class BooksController {
    @Autowired
    private BooksServiceimpl booksService;

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    public Object getBook() {
        return booksService.getBook();
    }

    @RequestMapping(value = "/getrecommendBook", method = RequestMethod.GET)
    public Object getrecommendBook(@RequestParam("params") int[] params) {
        return booksService.getrecommendBook(params);
    }

    @RequestMapping(value = "/getBookById",method = RequestMethod.GET)
    public Object getBookById(@RequestParam("params") int params){return booksService.getBookById(params);}

    @RequestMapping(value = "getBookWithPager",method = RequestMethod.GET)
    public Object getBookWithPager(String pageNum,String pageSize){
        Integer pagenum = Integer.parseInt(pageNum);
        Integer pagesize = Integer.parseInt(pageSize);
        return booksService.getBookWithPager(pagenum,pagesize);
    }

    @RequestMapping(value = "updateBook",method = RequestMethod.GET)
    public Object updateBook(Books books){
        return booksService.updateBook(books);
//        System.out.println(books);
    }

    @RequestMapping(value = "insertBook",method = RequestMethod.GET)
    public Object insertBook(Books books){
        return booksService.insertBook(books);
    }

    @RequestMapping(value = "deleteBook",method = RequestMethod.GET)
    public Object deleteBook(@RequestParam("id") int id){
        return booksService.deleteBook(id);
    }

    @RequestMapping(value = "searchBook",method = RequestMethod.GET)
    public Object searchBook(@RequestParam("params") String params){
//        System.out.println(params);
        return booksService.searchBook(params);};

    @RequestMapping(value = "getBookByTag",method = RequestMethod.GET)
    public Object getBookByTag(@RequestParam("tag") String tag){
        return booksService.getBookByTag(tag);
    }
}
