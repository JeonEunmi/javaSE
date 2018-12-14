package com.test115;

public class Box {
	
	// 제네릭 메소드
	// 매개변수와 반환자료형에 타입파라미터가 표현된 메소드
	// 제한된 타입파라미터(extends 키워드) 지정
	// 예를 들어 <T extends Number>인 경우 Number 자료형의 하위 자료형(Integer, Double, ...) 만 허용
	public static <T extends Number> boolean compare(T t1, T t2) {
		boolean result = false;
		
		result = t1.equals(t2);
		
		return result;
	}

}
