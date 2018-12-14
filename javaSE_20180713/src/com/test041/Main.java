package com.test041;

public class Main {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println(t.toString());
		// 기존 변수에 새 객체를 연결 -> 기존 객체는 쓰레기 객체가 된다.
		// -> 가비지컬렉서의 수집 작성이된다.
		
		t = new Test();
		System.out.println(t.toString());
		
		// 가비지 컬렉터 명시적 호출
		// 소멸자 자동 호출
		//->쓰래기 객체 소멸 작업
		System.gc();
	}

}
