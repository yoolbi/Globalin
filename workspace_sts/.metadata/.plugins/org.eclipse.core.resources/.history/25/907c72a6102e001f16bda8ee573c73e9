package org.zerock.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.EeneMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class EeneServiceImpl implements EeneService {
	
	@Setter(onMethod_ = @Autowired)
	EeneMapper eeneMapper;
	
	@Override
	public void testRead() {
		log.info("register......");
		List<Map> eeneList = eeneMapper.read();
		
	}
	
	

}
