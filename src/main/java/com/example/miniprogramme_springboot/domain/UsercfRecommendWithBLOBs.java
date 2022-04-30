package com.example.miniprogramme_springboot.domain;

public class UsercfRecommendWithBLOBs extends UsercfRecommend {
    private String uId;
    private String bId;
    private Books books;
    public String getuId() {
        return uId;
    }
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }
    public String getbId() {
        return bId;
    }
    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }
    public Books getBooks() {
        return books;
    }
    public void setBooks(Books books) {
        this.books = books;
    }
}