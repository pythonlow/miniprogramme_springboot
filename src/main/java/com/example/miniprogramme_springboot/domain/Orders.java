package com.example.miniprogramme_springboot.domain;

import java.sql.Date;

public class Orders {
    private Books books;

    public Ordersitem getOrdersitem() {
        return ordersitem;
    }

    public void setOrdersitem(Ordersitem ordersitem) {
        this.ordersitem = ordersitem;
    }

    private Ordersitem ordersitem;
    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private Integer state;
    private String u_name;
    private String adress;
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    private Integer id;


    private Integer uId;


    private Date time;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getuId() {
        return uId;
    }


    public void setuId(Integer uId) {
        this.uId = uId;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}