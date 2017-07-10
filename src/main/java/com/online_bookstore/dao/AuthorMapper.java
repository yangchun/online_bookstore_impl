package com.online_bookstore.dao;

import com.online_bookstore.domain.Author;

public interface AuthorMapper {
    int insert(Author record);

    int insertSelective(Author record);
}