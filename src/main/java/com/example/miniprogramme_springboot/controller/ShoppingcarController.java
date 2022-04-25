package com.example.miniprogramme_springboot.controller;

import com.example.miniprogramme_springboot.dao.BooksMapper;
import com.example.miniprogramme_springboot.dao.ShoppingcarMapper;
import com.example.miniprogramme_springboot.domain.Books;
import com.example.miniprogramme_springboot.domain.BooksKey;
import com.example.miniprogramme_springboot.domain.Shoppingcar;
import com.example.miniprogramme_springboot.recommend.Similarity;
import com.example.miniprogramme_springboot.service.impl.ShoppingcarServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Controller
public class ShoppingcarController {
    @Autowired
    private ShoppingcarServiceimpl shoppingcarService;

    @RequestMapping(value = "/getshoppingcar", method = RequestMethod.GET)
    private Object getshoppingcar() {
        return shoppingcarService.getshoppingcar();
    }

//    @RequestMapping(value = "recommendBook",method = RequestMethod.POST)
//    public Object recommendBook(HttpServletRequest req) {
//        long startTime = System.currentTimeMillis();//获取开始时间
//        Shoppingcar shoppingcar = new Shoppingcar();
////        ArrayList<> bid=shoppingcar.getbId();
//        Similarity sim = new Similarity();
//        BooksMapper booksMapper = new BooksMapper() {
//            @Override
//            public int deleteByPrimaryKey(BooksKey key) {
//                return 0;
//            }
//
//            @Override
//            public int insert(Books record) {
//                return 0;
//            }
//
//            @Override
//            public int insertSelective(Books record) {
//                return 0;
//            }
//
//            @Override
//            public Books selectByPrimaryKey(BooksKey key) {
//                return null;
//            }
//
//            @Override
//            public int updateByPrimaryKeySelective(Books record) {
//                return 0;
//            }
//
//            @Override
//            public int updateByPrimaryKey(Books record) {
//                return 0;
//            }
//
//            @Override
//            public List getBook() {
//                return null;
//            }
//
//            @Override
//            public ArrayList<String> getrecommendBook(String[] bid) {
//                return null;
//            }
//        };
//        ShoppingcarMapper shoppingcarMapper = new ShoppingcarMapper() {
//
//            @Override
//            public int insert(Shoppingcar record) {
//                return 0;
//            }
//
//            @Override
//            public int insertSelective(Shoppingcar record) {
//                return 0;
//            }
//
//            @Override
//            public List getshoppingcar() {
//                return null;
//            }
//        };
//        String bId[] = req.getParameterValues("bid");//传入购物车内的bid
//
//
////        ArrayList<Integer> shoppingList = new ArrayList<Integer>();//转换成动态数据int型
////        for(int i =0;i< bId.length;i++){
////            shoppingList.add(Integer.parseInt(bId[i]));
////        }
//
////        int uid = Integer.parseInt(req.getParameter("uid"));
//        ArrayList<String> str1 = new ArrayList<String>();
////        str1="1";
//        for (int i = 0; i < bId.length; i++) {
//            str1.add(booksMapper.getrecommendBook(bId[i]);
//        }
//        Map<Integer,Double> simList=new HashMap<Integer,Double>();
//
//        for (int i = 0; i < 600; i++) {
//            double res = sim.getSimilarDegree(str1, booksMapper.getrecommendBook(i));
////            if(!Double.isNaN(res)){
////                simList.put((Integer))
////            }
////            simList.put(res);
//            System.out.println(res);
//
//        }
//        return 1;
//
//    }
//


}
