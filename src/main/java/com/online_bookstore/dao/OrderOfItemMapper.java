package com.online_bookstore.dao;

import com.online_bookstore.domain.OrderOfItem;

public interface OrderOfItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderOfItem record);

    int insertSelective(OrderOfItem record);

    OrderOfItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderOfItem record);

    int updateByPrimaryKey(OrderOfItem record);
}