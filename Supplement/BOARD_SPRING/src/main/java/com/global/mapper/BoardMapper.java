package com.global.mapper;

import java.util.List;

import com.global.vo.BoardVO;

public interface BoardMapper {

	public int insert(BoardVO boardVO);
	public List<BoardVO> select(BoardVO boardVO);
	public int delete(BoardVO boardVO);
	public int update(BoardVO boardVO);
}
