package com.example.miniprogramme_springboot.dao;

import com.example.miniprogramme_springboot.domain.Favorites;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FavoritesMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Favorites record);

    int insertSelective(Favorites record);


    Favorites selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Favorites record);

    int updateByPrimaryKey(Favorites record);

    List getfavorites(@Param(value = "params") int params);

    List getislike(@Param(value = "bid") Integer bid1,@Param(value = "uid") Integer uid1);

    Integer insertfavorites(@Param(value = "bid") Integer bid1, @Param(value = "uid") Integer uid1);

    Integer deletefavorites(@Param(value = "bid") Integer bid1, @Param(value = "uid") Integer uid1);

    List getallfavorites(@Param(value = "pagenum") Integer pagenum, @Param(value = "pagesize") Integer pagesize);

    List getfavoritesdata();

    List getfavoritesrank();
}