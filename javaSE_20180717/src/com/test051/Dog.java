package com.test051;

// 실세계의 강아지(State, behavior)에 대한 소프트웨어 객체로 표현하는 과정
// -> Dog Class
public class Dog {
	
	// 객체(instance)의 상태값을 저장하는 변수
	// state -> color, name ... -> field	
	private String color;
	private String name;
	private int age;
	
	// 객체 (instance)의 액션 담당  - 객체와 어울리는 내용을 적어줄 것 
	// behavior -> barking, hungry, sleeping...   -> method
	public void barking() {
		// 액션코드
		System.out.println("bow-wow! bow-wow!");
		};
	
	public void hungry() {};
	
	public void sleeping() {};
	
	
}
