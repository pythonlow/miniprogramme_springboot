package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface BooksService {
    @Autowired
    List<Books> getBook();
    List<Books> getrecommendBook(int[] params);
    List<Books> getBookById( int params);
//    List<Books> getrecommendById(Map<Integer,Double> simList);
}
