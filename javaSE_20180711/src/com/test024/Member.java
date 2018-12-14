package com.test024;

//회원정보를 표현하는 클래스 선언
public class Member {

	//state 분석 -> 회원번호, 이름, 전화번호, .. -> field 표현 -> private 접근 제한자
	
	private String memberNum;
	private String name;
	private String callNum;
	public String group = "쌍용교육센터";

	//private field를 위한 getter, setter 구성
	/*
	public 반환자료형 getXXXX() {
		return 반환값;
	} 
	public void setXXXX(자료형 변수) {
		this.변수 = 변수;
	} 
	*/
	
	public String getMemberNum() {
		return this.memberNum;
	}
	
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
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
	
	public String group() {
		return this.group;
	}
}

