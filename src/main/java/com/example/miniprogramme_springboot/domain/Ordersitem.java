package com.example.miniprogramme_springboot.domain;

import java.util.List;

public class Ordersitem {
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Orders getOrders() {
        return orders;
    }
    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    private Integer orderid;
    private Orders orders;
    private Books books;
    private Integer uId;

    private Integer bId;

    private Integer amount;

    private Float discount;

    private Float unitprice;

    private Float totalprice;


    public Integer getOrderid() {
        return orderid;
    }


    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }


    public Integer getbId() {
        return bId;
    }


    public void setbId(Integer bId) {
        this.bId = bId;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Float getDiscount() {
        return discount;
    }


    public void setDiscount(Float discount) {
        this.discount = discount;
    }


    public Float getUnitprice() {
        return unitprice;
    }


    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Float getTotalprice() {
        return totalprice;
    }


    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

}