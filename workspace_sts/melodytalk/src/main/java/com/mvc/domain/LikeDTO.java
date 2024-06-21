package com.mvc.domain;

import lombok.Data;

@Data
public class LikeDTO {
	private String likeID;
	private String userID;
	private String postID;
}
