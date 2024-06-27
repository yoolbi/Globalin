package org.zerock.service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.EeneVO;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.EeneMapper;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

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

	@Transactional
	@Override
	public void insert(EeneVO eeneVO) {
		eeneVO.setEno(UUID.randomUUID().toString());
		eeneMapper.insert(eeneVO);
	}
	
	

}
