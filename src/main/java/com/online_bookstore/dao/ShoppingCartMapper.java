package com.online_bookstore.dao;

import com.online_bookstore.domain.ShoppingCart;

public interface ShoppingCartMapper {
    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);
}