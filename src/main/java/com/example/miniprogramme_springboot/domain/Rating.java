package com.example.miniprogramme_springboot.domain;


import java.sql.Date;

public class Rating {
    private Date time;
    private User user;

    public void setBooks(Books books) {
        this.books = books;
    }

    public Books getBooks() {
        return books;
    }

    private Books books;
    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    private Integer amount;

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setRnum(Float rnum) {
        this.rnum = rnum;
    }

    public Integer getAmount() {
        return amount;
    }

    public Float getRnum() {
        return rnum;
    }

    private Float rnum;
    private Integer id;
    private Integer uId;
    private Integer bId;
    private Integer rating;
    private Boolean isLike;
    private String comments;
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
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Boolean getIsLike() {
        return isLike;
    }
    public void setIsLike(Boolean isLike) {
        this.isLike = isLike;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }


}