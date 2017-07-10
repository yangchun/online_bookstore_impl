package com.online_bookstore.domain;

import java.util.Date;

public class Order {
    private Integer id;

    private Long orderPrice;

    private Date orderCreatetime;

    private Date orderPaytime;

    private Integer orderAddress;

    private Integer orderUser;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public Date getOrderPaytime() {
        return orderPaytime;
    }

    public void setOrderPaytime(Date orderPaytime) {
        this.orderPaytime = orderPaytime;
    }

    public Integer getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(Integer orderAddress) {
        this.orderAddress = orderAddress;
    }

    public Integer getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(Integer orderUser) {
        this.orderUser = orderUser;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}