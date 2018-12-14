package com.test116;

public class Util {
	
	// 와일드 카드 -> 자료형 제한 없음
	public static String getString1(Box<?> t) {
		return t.toString();
	}

	// 와일드 카드 -> <? extends Number> 는 Number 자료형 이거나, 하위 자료형 허용
	public static String getString2(Box<? extends Number> t) {
		return t.toString();
	}

	// <? super Integer> 는 Integer 자료형이거나, 상위 자료형 허용
	public static String getString3(Box<? super Integer> t) {
		return t.toString();
	}

}
