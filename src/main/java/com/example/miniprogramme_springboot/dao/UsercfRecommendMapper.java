package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.UsercfRecommend;
import com.example.miniprogramme_springboot.domain.UsercfRecommendWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsercfRecommendMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(UsercfRecommendWithBLOBs record);
    int insertSelective(UsercfRecommendWithBLOBs record);
    UsercfRecommendWithBLOBs selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(UsercfRecommendWithBLOBs record);
    int updateByPrimaryKeyWithBLOBs(UsercfRecommendWithBLOBs record);
    int updateByPrimaryKey(UsercfRecommend record);
    List getUsercf();

    Integer insertUsercf(@Param(value = "simList") Map<Long, Float> simList);
}