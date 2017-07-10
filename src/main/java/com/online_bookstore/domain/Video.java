package com.online_bookstore.domain;

import java.util.Date;

public class Video {
    private Integer id;

    private String videoName;

    private String videoUrl;

    private String videoIntro;

    private Integer videoAuthor;

    private Float videoPrice;

    private String videoImg;

    private Date videoPublishtime;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoIntro() {
        return videoIntro;
    }

    public void setVideoIntro(String videoIntro) {
        this.videoIntro = videoIntro == null ? null : videoIntro.trim();
    }

    public Integer getVideoAuthor() {
        return videoAuthor;
    }

    public void setVideoAuthor(Integer videoAuthor) {
        this.videoAuthor = videoAuthor;
    }

    public Float getVideoPrice() {
        return videoPrice;
    }

    public void setVideoPrice(Float videoPrice) {
        this.videoPrice = videoPrice;
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg == null ? null : videoImg.trim();
    }

    public Date getVideoPublishtime() {
        return videoPublishtime;
    }

    public void setVideoPublishtime(Date videoPublishtime) {
        this.videoPublishtime = videoPublishtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}