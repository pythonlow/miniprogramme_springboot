package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Shoppingcar;

import java.util.List;

public interface ShoppingcarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcar
     *
     * @mbggenerated
     */
    int insert(Shoppingcar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcar
     *
     * @mbggenerated
     */
    int insertSelective(Shoppingcar record);

    List getshoppingcar();
}