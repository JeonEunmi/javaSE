package com.test114;

public class Box {
	
	// 제네릭 메소드
	// 매개변수와 반환자료형에 타입파라미터가 표현된 메소드
	public static <T> boolean compare(T t1, T t2) {
		boolean result = false;
		
		result = t1.equals(t2);
		
		return result;
	}

}
