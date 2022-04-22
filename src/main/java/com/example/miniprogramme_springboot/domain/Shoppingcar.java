package com.example.miniprogramme_springboot.domain;

public class Shoppingcar {


    private Integer id;
    private Integer bId;



    private Book book;

    private Integer uId;


    private Integer amount;


    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Book getBook() { return book; }

    public void setBook(Book book) {  this.book = book;  }
    public Integer getId() { return id;}

    public void setId(Integer id) { this.id = id; }
}