package com.online_bookstore.domain;

import java.util.Date;

public class Book {
    private Integer id;

    private String bookName;

    private String bookUrl;

    private Integer bookAuthor;

    private String bookIntro;

    private Float bookPrice;

    private String bookType;

    private Date bookPublishtime;

    private String bookPublishhouse;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl == null ? null : bookUrl.trim();
    }

    public Integer getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Integer bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookIntro() {
        return bookIntro;
    }

    public void setBookIntro(String bookIntro) {
        this.bookIntro = bookIntro == null ? null : bookIntro.trim();
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType == null ? null : bookType.trim();
    }

    public Date getBookPublishtime() {
        return bookPublishtime;
    }

    public void setBookPublishtime(Date bookPublishtime) {
        this.bookPublishtime = bookPublishtime;
    }

    public String getBookPublishhouse() {
        return bookPublishhouse;
    }

    public void setBookPublishhouse(String bookPublishhouse) {
        this.bookPublishhouse = bookPublishhouse == null ? null : bookPublishhouse.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}