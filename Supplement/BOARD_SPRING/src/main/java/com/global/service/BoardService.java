package com.global.service;

import java.util.List;

import com.global.vo.BoardVO;

public interface BoardService {

	public void insert(BoardVO boardVO);
	public List<BoardVO> select(BoardVO boardVO);
	public void delete(BoardVO boardVO);
	public void update(BoardVO boardVO);
}
