package com.online_bookstore.dao;

import com.online_bookstore.domain.Address;
import java.util.*;
public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
    
    List<Map<String,String>> getAllAddress();
}