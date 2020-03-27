package com.test.sample.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sample.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<MemberDto> selectList() {
		List<MemberDto> list = new ArrayList<MemberDto>();

		try {
			list = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			System.out.println("[ERROR] : selectList");
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public MemberDto selectOne(int myno) {

		
		return null;
	}

	@Override
	public int insert(MemberDto dto) {
		int res = 0;
		try {
			System.out.println(dto);
			res = sqlSession.insert(NAMESPACE + "insert", dto);

			System.out.println("[DaoImpl - res ] : " + res);
		} catch (Exception e) {
			System.out.println("[ERROR - DaoImpl] : insert");
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(MemberDto dto) {
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}
	
	/*아이디 중복*/
	@Override
	public MemberDto idCheck(String m_id) {
		System.out.println("===> Mybatis로 idCheck");
		MemberDto result = sqlSession.selectOne(NAMESPACE+"idCheck",m_id);
		System.out.println(result);
		
		return result;
	}


}
