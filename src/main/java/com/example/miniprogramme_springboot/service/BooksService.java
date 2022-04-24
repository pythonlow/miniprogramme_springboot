package com.example.miniprogramme_springboot.service;

import com.example.miniprogramme_springboot.domain.Book;
import com.example.miniprogramme_springboot.domain.Books;

import java.util.List;

public interface BooksService {
    List<Books> getBook();
}
