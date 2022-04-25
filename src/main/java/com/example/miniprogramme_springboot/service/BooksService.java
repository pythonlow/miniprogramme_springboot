package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public interface BooksService {
    @Autowired
    List<Books> getBook();
//    ArrayList<String> getrecommendBook(Integer bid);

    //    @Override
    //    public List<Books> getrecommendBook() {
    //        return booksMapper.getrecommendBook();
    //    }
    List<Books> getrecommendBook(int[] params);
}
