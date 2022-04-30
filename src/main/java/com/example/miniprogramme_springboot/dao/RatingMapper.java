package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Rating;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    int insertSelective(Rating record);

    Rating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rating record);

    int updateByPrimaryKey(Rating record);

    List getRatingByBid(@Param(value = "bid")int params);

    List getRating(@Param(value = "bid") int params);
}