package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.recommend.ExtractData_1;
import com.example.miniprogramme_springboot.recommend.UserCF_1;
import com.example.miniprogramme_springboot.service.impl.RecommendServiceimpl;
import com.example.miniprogramme_springboot.service.impl.UsercfRecommendServiceimpl;
import org.apache.mahout.cf.taste.common.TasteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@Controller
public class UsercfRecommendController {
    @Autowired
    private UsercfRecommendServiceimpl usercfRecommendService;

    @RequestMapping(value = "/getUsercf", method = RequestMethod.GET)
    public Object getUsercf() {
        return usercfRecommendService.getUsercf();
    }

    @RequestMapping(value ="/insertUsercf",method = RequestMethod.GET)
    public Integer inserusercf(@RequestParam("params") int params) throws IOException, TasteException {
        ExtractData_1 extratdata = new ExtractData_1();
        extratdata.extractdata();
        UserCF_1 usercf = new UserCF_1();
        Map<Long,Float> simList= usercf.getusercf(params);
        System.out.println(simList);
        return usercfRecommendService.insertUsercf(simList);

    }
}
