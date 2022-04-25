package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.BooksMapper;
import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BooksServiceimpl implements BooksService {
    @Autowired
    private BooksMapper booksMapper;

    @Override
    public List<Books> getBook(){
        return booksMapper.getBook();
    }



//    @Override
//    public List<Books> getrecommendBook() {
//        return booksMapper.getrecommendBook();
//    }
    @Override
    public List<Books> getrecommendBook(int[] params) {
//        List<Books> books=new List<Books>();
        System.out.println("impl"+ Arrays.toString(params));


        return booksMapper.getrecommendBook(params);
    }



//    public List<Books> getcommendBook() {return booksMapper.getrecommendBook();}
}
