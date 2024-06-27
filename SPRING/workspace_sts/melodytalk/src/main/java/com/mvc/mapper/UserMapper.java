package com.mvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.mvc.domain.UserDTO;

@Mapper
@Component
public interface UserMapper {
	
	@Insert("INSERT INTO USERS(USER_ID, USERNAME, EMAIL, PASSWORD, NAME, COUNTRY, INTRO) values(#{userID}, #{username}, #{email}, #{password}, #{name}, #{country}, #{intro})")
	int insertUser(String userID, String username, String email, String password, String name, String country, String intro);

    @Select("SELECT * FROM USERS")
    List<UserDTO> getAllUsers();
    
    @Select("SELECT * FROM USERS WHERE USER_ID = #{userID}")
    UserDTO getUserByID(String userID);

}


