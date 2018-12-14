package com.test026;

public class Main {

	public static void main(String[] args) {
		
		//Test 클래스의 객체(instance) 생성
		Test t = new Test();
		
		//매개변수의 값 전달을 위한 Member 객체 생성
		//->name, age, phone 변수가 자동 초기화
		Member m = new Member();
		//사용자가 원하는 값을 초기화 진행 -> setter 호출
		m.setName("HONG");
		m.setPhone("010-1111-1111");
		m.setAge(26);
		
		//매개변수에 값 전달
		t.method(m); //이름, 전화번호, 나이 출력
		
		
	}

}
