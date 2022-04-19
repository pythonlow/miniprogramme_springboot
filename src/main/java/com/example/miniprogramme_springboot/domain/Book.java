package com.example.miniprogramme_springboot.domain;

import java.util.Date;

public class Book {

    private Integer bId;

    private String bTitle;


    private String bCover;


    private String author;


    private String press;


    private Date publishtime;


    private Float price;


    private Float rating;


    public Integer getbId() {
        return bId;
    }


    public void setbId(Integer bId) {
        this.bId = bId;
    }


    public String getbTitle() {
        return bTitle;
    }


    public void setbTitle(String bTitle) {
        this.bTitle = bTitle == null ? null : bTitle.trim();
    }


    public String getbCover() {
        return bCover;
    }


    public void setbCover(String bCover) {
        this.bCover = bCover == null ? null : bCover.trim();
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }


    public String getPress() {
        return press;
    }


    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }


    public Date getPublishtime() {
        return publishtime;
    }


    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }


    public Float getPrice() {
        return price;
    }


    public void setPrice(Float price) {
        this.price = price;
    }


    public Float getRating() {
        return rating;
    }


    public void setRating(Float rating) {
        this.rating = rating;
    }
}