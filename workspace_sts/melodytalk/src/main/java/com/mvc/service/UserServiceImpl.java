package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.domain.UserDTO;
import com.mvc.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
	@Override
	public List<UserDTO> getAllUsers() {
		return userMapper.getAllUsers();
	}

}
