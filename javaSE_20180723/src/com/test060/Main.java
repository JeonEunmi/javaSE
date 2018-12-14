package com.test060;

public class Main {

	public static void main(String[] args) {
		// Sub 클래스의 객체 생성
		Sub sub = new Sub();
		
		// Super, Object 클래스의 public, protected 멤버 접근 가능
		// 부모 클래스의 private 과 default 멤버는 접근 불가능 하다.
		sub.toString();  //  Object

	}

}
