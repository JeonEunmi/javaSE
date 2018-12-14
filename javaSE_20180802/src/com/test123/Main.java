package com.test123;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	// Set 컬렉션
	// -> value만 저장, 저장 순서가 유지되지 않고, 중복된 자료 저장
	// 구현 클래스 HashSet
	// 인덱스 관련 액션 불가
	
	Set<Member> set = new HashSet<Member>();
	
	set.add(new Member("홍길동","1234"));
	set.add(new Member("김자바", "5432"));
	
	// 중복 자료 저장 가능
	// -> 내부에서 equals() 메소드 호출 및 비교가 진행된다.
	// -> Member 클래스에서 equals() 메소드를 오버라이딩했기 때문에 값 비교를 하게 된다.
	set.add(new Member("홍길동", "1234"));
	
	System.out.println(set.size());
	System.out.println(set.toString());
	
	}

}