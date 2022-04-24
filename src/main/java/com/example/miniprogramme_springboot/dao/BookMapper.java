package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    int deleteByPrimaryKey(Integer bId);


    int insert(Book record);


    int insertSelective(Book record);


    Book selectByPrimaryKey(Integer bId);


    int updateByPrimaryKeySelective(Book record);


    int updateByPrimaryKey(Book record);

    List allBook();
}