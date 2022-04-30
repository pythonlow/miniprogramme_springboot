package com.example.miniprogramme_springboot.domain;

import java.util.Date;

public class Recommend {
    private Integer id;
    private Books books;
    private Integer uId;
    private Integer bId;
    private Float score;
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
    public Float getScore() {
        return score;
    }
    public void setScore(Float score) {
        this.score = score;
    }


    public Date getTime() {
        return time;
    }


    public void setTime(Date time) {
        this.time = time;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }
}