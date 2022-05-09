package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.service.impl.HistoryServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HistoryController {
    @Autowired
    private HistoryServiceimpl historyServiceimpl;

    @RequestMapping(value = "getHistoryByUid",method = RequestMethod.GET)
    public Object getHistoryByUid(@RequestParam(value = "uid")int uid){
        return historyServiceimpl.getHistoryByUid(uid);
    }

    @RequestMapping(value = "insertHistory",method = RequestMethod.GET)
    public Object insertHistory(String bid,String uid){
        Integer bid1=Integer.parseInt(bid);
        Integer uid1=Integer.parseInt(uid);
        return historyServiceimpl.insertHistory(bid1,uid1);
    }

}
