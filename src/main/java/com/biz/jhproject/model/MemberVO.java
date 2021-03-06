package com.biz.jhproject.model;


public class MemberVO {
	
	private String m_userid;  
	private String m_password; 
	private String m_name;     
	private String m_tel;
	private String m_addr;
	private String m_role;
	public String getM_userid() {
		return m_userid;
	}
	public void setM_userid(String m_userid) {
		this.m_userid = m_userid;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_tel() {
		return m_tel;
	}
	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}
	public String getM_addr() {
		return m_addr;
	}
	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}
	public String getM_role() {
		return m_role;
	}
	public void setM_role(String m_role) {
		this.m_role = m_role;
	}
	@Override
	public String toString() {
		return "MemberVO [m_userid=" + m_userid + ", m_password=" + m_password + ", m_name=" + m_name + ", m_tel="
				+ m_tel + ", m_addr=" + m_addr + ", m_role=" + m_role + "]";
	}
	public MemberVO(String m_userid, String m_password, String m_name, String m_tel, String m_addr, String m_role) {
		super();
		this.m_userid = m_userid;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_tel = m_tel;
		this.m_addr = m_addr;
		this.m_role = m_role;
	}
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
