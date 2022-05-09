package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.service.impl.ReceiveinfoServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ReceiveinfoController {
    @Autowired
    private ReceiveinfoServiceimpl receiveinfoServiceimpl;

    @RequestMapping(value = "getReceiveinfoByUid",method = RequestMethod.GET)
    public Object getReceiveinfoByUid(@RequestParam(value = "uid")int uid){
        return receiveinfoServiceimpl.getReceiveinfoByUid(uid);
    }

    @RequestMapping(value = "updateReceiveinfo",method = RequestMethod.GET)
    public Object updateReceiveinfo(String id,String name,String tel,String address,String ischoosed){
        Integer rid=Integer.parseInt(id);
        Boolean ischoose = Boolean.valueOf(ischoosed);
        return receiveinfoServiceimpl.updateReceiveinfo(rid,name,tel,address,ischoose);
    }
}
