package com.mvc.domain;

import java.util.Date;
import lombok.Data;

@Data
public class MessageGroupDTO {
	private String messageGroupID;
	private String fromUserID;
	private String toUserID;
	private Date date;
	private Integer checkRead;
}
