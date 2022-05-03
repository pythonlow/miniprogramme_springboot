package com.example.miniprogramme_springboot.domain;

import java.sql.Date;

public class Books extends BooksKey {

    private String cover;

    private String author;

    private String translator;

    private String publisher;

    private Date publishtime;

    private Float price;

    private String comment;

    private String type;

    private String tag;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator == null ? null : translator.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
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


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }


    public String getTag() {
        return tag;
    }


    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

}