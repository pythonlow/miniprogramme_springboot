package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.service.impl.FavoritesServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class FavoritesController {
    @Autowired
    private FavoritesServiceimpl favoritesService;

    @RequestMapping(value = "getfavorites",method = RequestMethod.GET)
    public Object getfavorites(@RequestParam("params") int params){return favoritesService.getfavorites(params);}

    @RequestMapping(value = "getislike",method = RequestMethod.GET)
    public Object getislike(String bid,String uid){
//        System.out.println(bid+uid);
        Integer bid1=Integer.parseInt(bid);
        Integer uid1=Integer.parseInt(uid);
        return favoritesService.getislike(bid1,uid1);
    }

    @RequestMapping(value = "insertfavorites",method = RequestMethod.GET)
    public Object insertfavorites(String bid,String uid){
//        System.out.println(bid+uid);
        Integer bid1=Integer.parseInt(bid);
        Integer uid1=Integer.parseInt(uid);
        return favoritesService.insertfavorites(bid1,uid1);
    }

    @RequestMapping(value = "deletefavorites",method = RequestMethod.GET)
    public Object deletefavorites(String bid,String uid){
        Integer bid1=Integer.parseInt(bid);
        Integer uid1=Integer.parseInt(uid);
        return favoritesService.deletefavorites(bid1,uid1);
    }

    @RequestMapping(value = "getallfavorites",method = RequestMethod.GET)
    public Object getallfavorites(String pageNum,String pageSize){
        Integer pagenum = Integer.parseInt(pageNum);
        Integer pagesize = Integer.parseInt(pageSize);
        return favoritesService.getallfavorites(pagenum,pagesize);
    }

    @RequestMapping(value = "getfavoritesdata",method = RequestMethod.GET)
    public Object getfavorites(){
        return favoritesService.getfavoritesdata();
    }


    @RequestMapping(value = "getfavoritesrank",method = RequestMethod.GET)
    public Object getfavoritesrank(){return favoritesService.getfavoritesrank();}
}
