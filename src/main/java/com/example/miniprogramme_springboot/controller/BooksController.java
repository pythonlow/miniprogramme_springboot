package com.example.miniprogramme_springboot.controller;


import com.example.miniprogramme_springboot.service.impl.BooksServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@RestController
@Controller
public class BooksController {
    @Autowired
    private BooksServiceimpl booksService;

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    public Object getBook() {
        return booksService.getBook();
    }

    @RequestMapping(value = "/getrecommendBook", method = RequestMethod.GET)
    public Object getrecommendBook(@RequestParam("params") int[] params) {
//        String bid = req.getParameter("bid");
//        return booksService.getrecommendBook(Integer.parseInt(bid));
//        for(int param :params){
//                System.out.println(param);
//        }
        System.out.println(Arrays.toString(params));
        return booksService.getrecommendBook(params);
    }

//    @RequestMapping(value = "/getBooks",method = RequestMethod.GET)
//    public ResponseData SmartPushUsers(@RequestBody RequestDepartmentID ReqID) {
//        ResponseData responseData = new ResponseData();
//        ArrayList<Integer> deptid = ReqID.getDepartment_id();
//        Collections.sort(deptid);
//        if (deptid.size()<=0) {
//            responseData.setCode(-1);
//            responseData.setMessage("该部门信息有误");
//            responseData.setData(null);
//            return responseData;
//        } else {
//            responseData.setData(smartPushService.getUsersByDepartmentid(deptid));
//            responseData.setCode(200);
//            return responseData;
//        }
//    }
}
