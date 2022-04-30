package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.domain.BooksKey;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public interface BooksMapper {
    int deleteByPrimaryKey(BooksKey key);
    int insert(Books record);
    int insertSelective(Books record);
    Books selectByPrimaryKey(BooksKey key);
    int updateByPrimaryKeySelective(Books record);
    int updateByPrimaryKey(Books record);
    List getBook();
//    List getrecommendBook(Books record);
    List<Books> getrecommendBook(@Param(value = "bid") int[] params);


    List getBookById(@Param(value = "bid") int params);

//    Integer getrecommendBookById(@Param(value = "simList") Map<Integer, Double> simList);
}