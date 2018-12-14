package com.test072;

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
		this.name= name;
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
	


	
}
