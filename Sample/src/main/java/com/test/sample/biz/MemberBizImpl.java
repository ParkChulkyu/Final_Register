package com.test.sample.biz;

import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.mail.util.logging.MailHandler;
import com.test.mail.TempKey;
import com.test.sample.dao.MemberDao;
import com.test.sample.dto.MemberDto;

@Service
public class MemberBizImpl implements MemberBiz {

	@Autowired
	private MemberDao dao;

	@Override
	public List<MemberDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MemberDto selectOne(int myno) {
		return null;
	}

	@Override
	public int insert(MemberDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(MemberDto dto) {
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}
//  /*아이디 중복*/
//	@Override
//	public int insertUserData(Map<String, Object> map) {
//
//		return dao.selectUserID(map);
//	}

	/* 이메일인증 */
	@Override
	public void create(MemberDto dto) {
		dao.insert(dto); // 회원가입 DAO
		String key = new TempKey().getKey(50, false); // 인증키 생성
		dao.createAuthKey(dto.getM_email(), key); // 인증키 DB저장
		MailHandler sendMail = new MailHandler(mailSender);
		sendMail.setSubject("[홈페이지 이메일 인증]"); // 메일제목
		sendMail.setText( // 메일내용
				"<h1>메일인증</h1>" +
				"<a href='http://localhost/user/emailConfirm?userEmail=" + vo.getUserEmail() +
				"&key=" + key +
				"' target='_blenk'>이메일 인증 확인</a>");
		sendMail.setFrom("아이디@gmail.com", "보낼사람 이름"); // 보낸이
		sendMail.setTo(vo.getUserEmail()); // 받는이
		sendMail.send();
	}

	@Override
	public void userAuth(String m_email) {

	}
}
