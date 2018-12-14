package com.test026;

//사용자 정의 자료형 클래스(참조형) 선언
public class Member {
	
	//자료 구성은 원하는 대로 할 수 있다
	//-> 갯수, 자료형, 순서 제한이 없다
	//-> private 필드(field)로 구성. 생성자, getter, setter 추가
	private String name;
	private String phone;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//문제) getter, setter 작성

	
	
}
