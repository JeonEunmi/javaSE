package com.test002;

import com.test001.Sample;

//실행 클래스
public class Main {
	public static void main(String[] args) {
		
		// 다른 패키지 내에 있는 클래스의 멤버 접근
		// -> 패키지명.클래스명 형태로 작성
		// -> import 구문 사용 (Ctrl + Shift + O)
		
		//public 키워드 있는 클래스의 객체
		//com.test001.Sample a = new com.test001.Sample();
		Sample a = new Sample();
		a.msg();
		
		//public 키워드 없는 클래스의 객체 (에러발생)
		//com.test001.Test b = new com.test001.Test();
		//Test b = new Test();
		//b.msg();
		
		//Math클래스도 다른 패키지에 속한다. (java.lang)에 속한다.
		//->import 구문 사용 X
		//->java.lang 패키지만 유일하게 생략 가능하다.
		//자바에서 제공하는 유일한 기본패키지이기 때문이다.
		double m = Math.random();
		System.out.println(m);
		
	}
}
