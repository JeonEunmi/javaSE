package com.member04;

// 자료형 클래스 선언
public class Member {
	
	// 자료 항목에 따른 필드 구성
	private String memberNum;
	private String name;
	private String callNum;
	private String mail;
	private String registrationDate;
	
	// 생성자 -> 기본 생성자, 매개변수 있는 생성자
	public Member() {
		
	}
	
	public Member(String memberNum, String name, String callNum, String mail, String registrationDate) {
		this.memberNum = memberNum;
		this.name = name;
		this.callNum = callNum;
		this.mail = mail;
		this.registrationDate = registrationDate;
	}
	
	// getter, setter
	
	public String getMemberNum() {
		return this.memberNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCallNum() {
		return this.callNum;
	}
	
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
		
	public String getMail() {
		return this.mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getRegistrationDate() {
		return this.registrationDate;
	}
	
	// toString()메소드
	
	public String toString(){
		String result = "";
		result = String.format("회원번호 : %s | 회원이름 : %s | 전화번호 : %s | 메일 : %s | 등록일 : %s",
				this.getMemberNum(), this.getName(), this.getCallNum(), this.getMail(), this.getRegistrationDate());
		return result;
	}
}
