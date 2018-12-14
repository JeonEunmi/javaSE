package com.test118;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 컬렉션 (Collections)
		// -> 다량의 자료를 메모리에 저장할 수 있는 저장소
		// -> 배열의 단점(크기 고정, 인덱스 관리, null값)을 해소할 수 있는 기능 제공
		// -> List, Set, Map 인터페이스 구현 클래스가 존재한다.
		// -> java.util 패키지 소속
		
		// List 인터페이스 (Collection 인터페이스의 하위 인터페이스)
		// -> value만 저장, 인덱스 제공, 저장 순서가 유지되고, 중복된 자료 저장 가능, 정렬 가능
		// -> 구현 클래스 ArrayList
		
		// Set 인터페이스 (Collection 인터페이스의 하위 인터페이스)
		// -> value만 저장, 저장 순서가 유지되지 않고, 중복된 자료 저장 불가, 정렬 불가
		// -> 구현 클래스 HashSet
		
		// Map 인터페이스
		// -> key, value 의 쌍으로 저장, key 인덱스는 중복 불가, value는 중복 가능
		// -> 구현 클래스 HashMap
		
		// 빈 컬렉션 저장소 준비
		List<String> list = new ArrayList<String>();
		
		// 자료 추가
		list.add("TEST");
		list.add("HELLO");
		list.add(2, "DATA");
		// 자료 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list);
		
		
		// 자료 검색
		System.out.println(list.contains("TEST"));
		System.out.println(list.contains("ABCD"));
		
		// 자료 삭제
		list.remove("HELLO");
		System.out.println(list);
		
		// 다량의 자료를 한번에 입력
		// -> Arrays.asList()
		
		List<String> temp = Arrays.asList("JAVA", "MIN", "HONG", "PARK");
		
		for(String s : temp) {
			System.out.println(s);
		}
		
		System.out.println(temp.toString());
		

	}

}
