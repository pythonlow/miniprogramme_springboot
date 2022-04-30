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

    @Override
    public List<Books> getrecommendBook(int[] params) {
        return booksMapper.getrecommendBook(params);
    }

    @Override
    public List<Books> getBookById(int params) {return booksMapper.getBookById(params);
    }

//    @Override
//    public Integer getrecommendBookById(Map<Integer, Double> simList) {
//        return booksMapper.getrecommendBookById(simList);
//    }


//    public List<Books> getcommendBook() {return booksMapper.getrecommendBook();}
}
