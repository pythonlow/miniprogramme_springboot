package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.ReceiveinfoMapper;
import com.example.miniprogramme_springboot.domain.Receiveinfo;
import com.example.miniprogramme_springboot.service.ReceiveinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiveinfoServiceimpl implements ReceiveinfoService {
    @Autowired
    private ReceiveinfoMapper receiveinfoMapper;

    public List<Receiveinfo> getReceiveinfoByUid(int uid) {
        return receiveinfoMapper.getReceiveinfoByUid(uid);
    }

    public Integer updateReceiveinfo(Integer rid,String name, String tel, String address, Boolean ischoose) {
        return receiveinfoMapper.updateReceiveinfo(rid,name,tel,address,ischoose);
    }
}
