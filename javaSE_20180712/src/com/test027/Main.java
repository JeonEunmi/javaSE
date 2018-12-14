package com.test027;

public class Main {

	public static void main(String[] args) {
		
		//Test 클래스의 객체(instance) 생성
		Test t = new Test();
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		//문제) 여러명의 회원정보(이름, 전화번호, 나이)를 매개변수에 전달
		//m1 -> HONG 사용자
		//m2 -> PARK 사용자
		
		
		m1.setName("HONG");
		m1.setPhone("010-1111-1111");
		m1.setAge(20);
		
		m2.setName("PARK");
		m2.setPhone("010-2222-2222");
		m2.setAge(21);
		
		m3.setName("CHOI");
		m3.setPhone("010-3333-3333");
		m3.setAge(26);
		
		t.m(m1, m2, m3);
		
	}

}
