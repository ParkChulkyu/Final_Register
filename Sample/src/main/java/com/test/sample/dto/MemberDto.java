package com.test.sample.dto;

public class MemberDto {

	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_email;
	private String m_addr;
	private String m_addr2;
	private String m_join;
	private String m_grade;

	public MemberDto() {
	}

	public MemberDto(int m_no, String m_id, String m_pw, String m_name, String m_email, String m_addr, String m_addr2,
			String m_join, String m_grade) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_addr = m_addr;
		this.m_addr2 = m_addr2;
		this.m_join = m_join;
		this.m_grade = m_grade;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_addr() {
		return m_addr;
	}

	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}

	public String getM_addr2() {
		return m_addr2;
	}

	public void setM_addr2(String m_addr2) {
		this.m_addr2 = m_addr2;
	}

	public String getM_join() {
		return m_join;
	}

	public void setM_join(String m_join) {
		this.m_join = m_join;
	}

	public String getM_grade() {
		return m_grade;
	}

	public void setM_grade(String m_grade) {
		this.m_grade = m_grade;
	}

	@Override
	public String toString() {
		return "MemberDto [m_no=" + m_no + ", m_id=" + m_id + ", m_pw=" + m_pw + ", m_name=" + m_name + ", m_email="
				+ m_email + ", m_addr=" + m_addr + ", m_addr2=" + m_addr2 + ", m_join=" + m_join + ", m_grade="
				+ m_grade + "]";
	}

}
