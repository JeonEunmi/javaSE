package com.test121;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// Set 컬렉션
		// -> value 만 저장, 저장 순서가 유지되지 않고,
		//    들어갈 때의 순서와 나올 때의 순서가 다르다.
		// -> 중복된 자료 저장 불가, 하나의 null만 저장 가능 하다.
		// -> 구현 클래스 HashSet
		// -> 인덱스 관련 액션 불가
		
		Set<String> set = new HashSet<String>();
		
		set.add("TEST");
		set.add("HELLO");
		set.add("JAVA");
		set.add("JDBC");
		set.add("ORACLE");		
		set.add("TEST");  // X
		
		// -> 내부에서 equals() 메소드 호출 및 비교가 진행된다.
		// -> String 클래스는 equals() 메소드가 문자열 값 비교를 하도록 오버라이딩 되어있다.
		System.out.println(set.toString());
		
		set.remove("HELLO");
		System.out.println(set.toString());
		
		// 반복문을 이용한 Set 컬렉션 엘리먼트 탐색 
		System.out.println("----------------");
		for(String s : set) {
			System.out.println(s);
		}
		
		// 반복자(Iterator)를 이용한 Set 컬렉션 엘리먼트 검색
		System.out.println("----------------");
		// 반복자 얻기
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.println(temp);
		}
		
	}

}
