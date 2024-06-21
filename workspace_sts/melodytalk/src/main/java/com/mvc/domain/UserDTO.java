package com.mvc.domain;

import lombok.Data;

@Data
public class UserDTO {
	private String userID;
	private String username;
	private String email;
	private String password;
	private String name;
	private String country;
	private String intro;
}
