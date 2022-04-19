package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.BookMapper;
import com.example.miniprogramme_springboot.domain.Book;
import com.example.miniprogramme_springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> allBook(){
        return bookMapper.allBook();
    }
}
