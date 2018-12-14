package com.test;

public class OOP011 {

	public static void main(String[] args) {
		
		// 동일한 클래스(blueprint 특성)를 이용해서 여러개의 객체 생성 가능
		// -> 각각의 객체는 서로 독립적인 상태
		
		// Student 클래스에 대한 객체(instance) 생성
		Student s1 = new Student();
		System.out.println(s1.toString());
		
		//Student 클래스에 대한 객체(instance) 생성
		Student s2 = new Student();
		System.out.println(s2.toString());
	}

}
