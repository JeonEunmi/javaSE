package com.test111;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// 제네릭(Generic)
		// -> 한전된 타입을 사용하도록 유도함으로써 타입 안정성 보장
		// -> 선언시에는 범용적으로 선언하고, 사용시에는 한정적으로 사용

		// 제네릭 사용 후
		/*
		public class ArrayList<E>
			extends AbstractList<E>
			implements List<E>, RandomAccess, Cloneable, Serializable
		*/

		// 빈 리스트 컬렉션준비
		List<String> list = new ArrayList<String>();

		// 제한된 자료형의 자료만을 저장
		// -> 컴파일시 강한 타입 체크
		// list.add(10); //정수 자료형 저장 불가
		list.add("TEST"); // 문자열 자료형

		// get() 메소드를 이용해서 자료 접근 가능
		// -> Object 자료형으로 반환
		System.out.println(list.get(0)); // "TEST"

		// 강제 형변환 불필요
		String s = list.get(0); // "TEST"

		System.out.println("----------------------");
		// 저장된 자료형을 분석하지 않고 형변환 시도
		// Integer i2 = (Integer) list.get(0); // Checked Exception
		// -> 실행전에 컴파일 과정에서 타입 검사 가능
	}

}
