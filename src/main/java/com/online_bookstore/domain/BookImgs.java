package com.online_bookstore.domain;

public class BookImgs {
    private Integer id;

    private Integer bookId;

    private String bookImgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookImgurl() {
        return bookImgurl;
    }

    public void setBookImgurl(String bookImgurl) {
        this.bookImgurl = bookImgurl == null ? null : bookImgurl.trim();
    }
}