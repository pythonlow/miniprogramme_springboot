package com.example.miniprogramme_springboot.domain;

import java.sql.Date;

public class Favorites {
    private Books books;

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    private Integer id;

    private Integer uId;


    private Integer bId;


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


    public Integer getbId() {
        return bId;
    }


    public void setbId(Integer bId) {
        this.bId = bId;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}