package com.test073;

// 회원 정보를 저장하는 클래스
public class Member {

	// 회원번호(mid), 이름(name), 전화번호(phone)
	private String mid, name, phone;

	// 기본 생성자
	public Member() {

	}

	// 매개변수가 있는 생성자
	public Member(String mid, String name, String phone) {
		this.mid = mid;
		this.name = name;
		this.phone = phone;
	}

	// getter, setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMid() {
		return this.mid;
	}

	@Override
	public String toString() {
		return "Member [mid=" + this.getMid() + ", name=" + this.getName() + ", phone=" + this.getPhone() + "]";
	}

	// Object equals () 메소드에 대한 오버라이딩
	// -> 참조주소 비교 기능을 회원아이디 비교 기능으로 수정
	// -> 원본 메소드 시그니처 유지할 것
	// -> 비교 대상인 Member 객체가 Object 자료형의 변수 obj에 전달 -> 다형성
	@Override
	public boolean equals(Object obj) {
		
		//Member 객체가 Object 자료형 변수에 저장되면
		//->접근 가능한 멤버 제한
		//->원래의 Member 객체로 형변환 필요
		//->(자식자료형클래스)부모자료형변수
		boolean result = false;
		Member m = (Member)obj;
		if (this.getMid().equals(m.getMid())) {
			result = true;
		} 
		return result;
		
	}

}
