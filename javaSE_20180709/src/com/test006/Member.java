package com.test006;

public class Member {

	//문제)belong
	//필드 구성
	//회원의 state 분석 -> 회원번호('M001' 패턴 : 문자열), 이름, 나이, 번호, ... ->field 구성
	// 클래스에 대한 객체(instance) 생성 -> 여러개의 객체 생성
	// 객체의 상태값 출력 -> 각각의 객체가 다른 상태값
	// 소속 ->"쌍용교육센터" 한정 -> 명시적 초기화
	// 생성자(메소드)를 이용한 필드의 초기화 지원
	
	String name;
	String memberNumber;
	String kakaoID;
	String call;
	String group = "쌍용교육센터";
	int age;
	
	public Member(String name, String memberNumber, String kakaoID, String call, int age) {
		this.name = name;
		this.memberNumber = memberNumber;
		this.kakaoID = kakaoID;
		this.call = call;
		this.age = age;
		
	}
	
	
}
