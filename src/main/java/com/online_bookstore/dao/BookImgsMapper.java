package com.online_bookstore.dao;

import com.online_bookstore.domain.BookImgs;

public interface BookImgsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookImgs record);

    int insertSelective(BookImgs record);

    BookImgs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookImgs record);

    int updateByPrimaryKey(BookImgs record);
}