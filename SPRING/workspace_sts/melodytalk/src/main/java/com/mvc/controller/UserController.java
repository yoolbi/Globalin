package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.domain.UserDTO;
import com.mvc.mapper.UserMapper;

import lombok.extern.log4j.Log4j;

@RestController
@CrossOrigin
@RequestMapping("/users/*")
@Log4j
public class UserController {
		
    @Autowired
    private UserMapper userMapper;

    @Autowired
    public UserDTO user;
    
    @GetMapping("/all")
    public Object getUsers(){
    	log.info("click get all users");
    	log.info(userMapper.getAllUsers());
        return userMapper.getAllUsers();
    }
    
    @GetMapping("/userID/{userID}")
    public Object getUserByID(@PathVariable("userID") String userID){
    	log.info("get user from userID");
        return userMapper.getUserByID(userID);
    }
    
    @PostMapping("/new")
    public Object postUser(UserDTO user){
        return userMapper.insertUser(user.getUserID(), user.getUsername(), user.getEmail(), user.getPassword(), user.getName(), user.getCountry(), user.getIntro());
    }
    

}
