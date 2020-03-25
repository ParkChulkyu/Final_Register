package com.test.sample.biz;

import java.util.List;
import java.util.Map;

import com.test.sample.dto.MemberDto;

public interface MemberBiz {
	public List<MemberDto> selectList();

	public MemberDto selectOne(int myno);

	public int insert(MemberDto dto);

	public int update(MemberDto dto);

	public int delete(int myno);
	
//	public int insertUserData(Map<String, Object> map);

}
