package com.online_bookstore.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_bookstore.dao.AddressMapper;
import com.online_bookstore.service.AddressService;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressMapper addressMapper;
	
	public List<Map<String, String>> getAllAddress() {
		// TODO Auto-generated method stub
		return addressMapper.getAllAddress();
	}

}
