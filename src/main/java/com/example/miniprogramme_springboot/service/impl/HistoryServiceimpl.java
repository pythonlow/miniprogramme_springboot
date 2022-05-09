package com.example.miniprogramme_springboot.service.impl;

import com.example.miniprogramme_springboot.dao.HistoryMapper;
import com.example.miniprogramme_springboot.domain.History;
import com.example.miniprogramme_springboot.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServiceimpl implements HistoryService {
    @Autowired
    private HistoryMapper historyMapper;

    public List<History> getHistoryByUid(int uid) {
        return historyMapper.getHistoryByUid(uid);
    }

    public Integer insertHistory(Integer bid1, Integer uid1) {
        return historyMapper.insertHistory(bid1,uid1);
    }
}
