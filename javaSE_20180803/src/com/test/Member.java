package com.test;

public class Member {

	private String name, phone;

	// 기본생성자, 매개변수 있는 생성자
	// getter, setter
	// toString() equals(), hashCode() -> Overriding
	public Member() {

	}

	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

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

	@Override
	public String toString() {
		return  "[" + name + "," + phone + "]";
	}

	@Override
	public int hashCode() {
		// 동일한 이름을 가진 경우 동일한 해쉬코드 반환
		return this.getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// 이름, 전화번호 일치 여부 검사 과정 추가
		Member other = (Member)obj;
		boolean result1 = this.getName().equals(other.getName());
		boolean result2 = this.getPhone().equals(other.getPhone());
		return result1 && result2;
	}


	
	
}
