package com.test113;

public class Main {

	public static void main(String[] args) {
		
		// Box<T> 클래스에 대한 객체 생성
		// -> 타입파라미터에 대한 명시적 자료형 지정 필요
		
		// String, Integer로 지정한 경우
		Box<String, Integer> box1 = new Box<String, Integer>("M01", 100);
		System.out.println(box1.getKey());  //"M01"
		System.out.println(box1.getValue());  // 100

		
	}

}
