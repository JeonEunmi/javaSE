package com.test045;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 싱글톤 상태 확인
		// ->객체 요청을 여러번 시도해보고, 같은 객체인지 확인

		// Test 클래스의 객체(instance) 요청 과정
		// new Test() X
		// Test.getInstance() O
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();

		// private 생성자 때문에 객체 생성 불가
		// Test t3 = new Test();

		// 참조 주소 출력
		System.out.println(t1.toString());
		System.out.println(t2.toString());

		// 참조 주소 비교
		System.out.println(t1 == t2);

		// Calendar 클래스는 직접 객체 생성 불가
		// Calendar cal = new Calendar();
		// Calendar 클래스는 getInstance() 메소드로 객체 생성
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));

	}

}
