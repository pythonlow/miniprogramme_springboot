package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Shoppingcar;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShoppingcarMapper {

    int insert(Shoppingcar record);


    int insertSelective(Shoppingcar record);

    List getshoppingcar();
    Integer getrecommendBook(@Param(value = "simList")Map<Integer, Double> simList);

    Integer insertshoppingcar(@Param(value = "bid") int params);

    Integer updateshoppingcar(@Param(value = "bid") int params1,@Param(value = "amount") int params2);

    Integer deleteshoppingcar(@Param(value = "bid") int params);

//    List recommendBook();
}