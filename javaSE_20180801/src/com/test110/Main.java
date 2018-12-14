package com.test110;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// 제네릭(Generic)
		// -> 한정된 타입을 사용하도록 유도함으로써 타입 안정성 보장
		// -> 선언시에는 범용적으로 선언하고, 사용시에는 한정적으로 사용
		
		// 제네릭 사용 전
		
		// 빈 리스트 준비
		List list = new ArrayList();
		
		// 다양한 자료형의 자료를 저장
		list.add(10); //정수 자료형
		list.add("TEST"); // 문자열 자료형
		
		// get() 메소드를 이용해서 자료 접근 가능
		// -> Object 자료형으로 반환
		System.out.println(list.get(0));  //10
		System.out.println(list.get(1));  //"TEST"
		
		// 강제 형변환 필요 -> 형변환 전에 자료형 분석 필요
		Integer i = (Integer)list.get(0); //10
		String s = (String)list.get(1); //"TEST"
		
		System.out.println("----------------------");
		// 저장된 자료형을 분석하지 않고 형변환 시도
		Integer i2 = (Integer)list.get(1);   //ClassCastException
		// -> 입력시에 자료형 분석을 하는 것을 권장(컴파일시 강한 타입 체크)
		// -> 제네릭 표현 사용
	}

}
