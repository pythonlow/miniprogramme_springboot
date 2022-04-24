package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.BooksMapper;
import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceimpl implements BooksService {
    @Autowired
    private BooksMapper booksMapper;

    @Override
    public List<Books> getBook(){
        return booksMapper.getBook();
    }
}
