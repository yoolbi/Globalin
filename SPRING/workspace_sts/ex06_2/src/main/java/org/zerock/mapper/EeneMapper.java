package org.zerock.mapper;

import java.util.List;
import java.util.Map;

import org.zerock.domain.EeneVO;

public interface EeneMapper {
	
	public List<Map> read();
	
	public void insert(EeneVO eeneVO);

}
