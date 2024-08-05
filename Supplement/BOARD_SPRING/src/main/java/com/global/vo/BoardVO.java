package com.global.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int seq;
	private String title;
	private String content;
	private Date createdate;
}
