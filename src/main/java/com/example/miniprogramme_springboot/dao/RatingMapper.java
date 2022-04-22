package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Rating;
import org.apache.ibatis.annotations.Select;

public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    int insertSelective(Rating record);


    Rating selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Rating record);

    int updateByPrimaryKey(Rating record);

}