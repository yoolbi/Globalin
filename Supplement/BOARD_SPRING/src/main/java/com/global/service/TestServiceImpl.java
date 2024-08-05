package com.global.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.mapper.TestMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class TestServiceImpl implements TestService {
	
	@Setter(onMethod_ = @Autowired)
	private TestMapper testMapper;

	@Override
	public String getNow() {
		log.info(testMapper);
		return testMapper.selectNow();
	}

}
