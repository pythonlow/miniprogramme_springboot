package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.domain.BooksKey;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksMapper {

    int deleteByPrimaryKey(BooksKey key);


    int insert(Books record);


    int insertSelective(Books record);


    Books selectByPrimaryKey(BooksKey key);


    int updateByPrimaryKeySelective(Books record);


    int updateByPrimaryKey(Books record);
    List getBook();
}