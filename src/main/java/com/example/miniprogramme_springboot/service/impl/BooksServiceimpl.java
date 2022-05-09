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

    public List<Books> getBookWithPager(int pagenum, int pagesize) {
        return booksMapper.getBookWithPager(pagenum,pagesize);
    }

    public Integer updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Integer insertBook(Books books) {
        return booksMapper.insertBook(books);
    }

    public Integer deleteBook(int id) {
        return booksMapper.deleteBook(id);
    }

    public List<Books> searchBook(String params) {
        return booksMapper.searchBook(params);
    }

    public List<Books> getBookByTag(String tag) {
        return booksMapper.getBookByTag(tag);
    }

//    @Override
//    public Integer getrecommendBookById(Map<Integer, Double> simList) {
//        return booksMapper.getrecommendBookById(simList);
//    }


//    public List<Books> getcommendBook() {return booksMapper.getrecommendBook();}
}
