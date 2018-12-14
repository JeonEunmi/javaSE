package com.test039;

public class Member {

	//필드 구성
	//회원의 state 분석 -> 회원번호('M001' 패턴 : 문자열), 이름, 나이, 번호, ... ->field 구성
	// 소속 ->"쌍용교육센터" 한정 -> 명시적 초기화
	// 생성자(메소드)를 이용한 필드의 초기화 지원
	
	//자동 초기화 (1순위)
	private String name;  //null
	private String memberNumber;  //null
	private String kakaoID;  //null
	private String call;  //null
	private int age;
	
	//명시적 초기화 (2순위)
	private String group = "쌍용교육센터";
	
	//기본 생성자 추가
	public Member() {
		
	}
	//생성자 초기화 (3순위)
	public Member(String name, String memberNumber, String kakaoID, String call, int age) {
		this.name = name;
		this.memberNumber = memberNumber;
		this.kakaoID = kakaoID;
		this.call = call;
		this.age = age;
		
	}

	
	//getter -> 읽기 전용
	//setter -> 쓰기 전용
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberNumber() {
		return this.memberNumber;
	}

	public String getKakaoID() {
		return this.kakaoID;
	}

	public void setKakaoID(String kakaoID) {
		this.kakaoID = kakaoID;
	}

	public String getCall() {
		return this.call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGroup() {
		return this.group;
	}
	
	
	//회원 정보 출력용 전용 메소드
	//toString() 메소드는 자동 호출되는 메소드이다.
	public String toString() {
		String result = "";
		result = String.format("%s, %s, %s, %s, %s, %s%n"
				, this.getName(), this.getMemberNumber(), this.getAge()
				, this.getKakaoID(), this.getCall(), this.getGroup());
		return result;
	}
	
	
	
}
