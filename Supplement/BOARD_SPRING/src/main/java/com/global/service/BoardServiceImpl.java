package com.global.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.global.mapper.BoardMapper;
import com.global.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	@Transactional
	public void insert(BoardVO boardVO) {
		boardMapper.insert(boardVO);
	}

	@Override
	public List<BoardVO> select(BoardVO boardVO) {
		return boardMapper.select(boardVO);
	}

	@Override
	@Transactional
	public void delete(BoardVO boardVO) {
		boardMapper.delete(boardVO);
	}

	@Override
	public void update(BoardVO boardVO) {
		boardMapper.update(boardVO);
	}

}
