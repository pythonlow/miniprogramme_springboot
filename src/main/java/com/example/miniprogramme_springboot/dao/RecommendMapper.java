package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Recommend;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RecommendMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(Recommend record);
    int insertSelective(Recommend record);
    Recommend selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Recommend record);
    int updateByPrimaryKey(Recommend record);
    List getItemBC();
}