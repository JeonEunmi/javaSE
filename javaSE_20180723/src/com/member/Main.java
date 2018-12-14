package com.member;

public class Main {

	public static void main(String[] args) {
		// Member 클래스의 객체 생성
		Member m1 = new Member("M01", "HONG", "010-1234-1234");
		Member m2 = new Member("M02", "JEON", "010-5678-5678");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		// 배열 저장소에 저장
		Member[] memberList = new Member[5];
		memberList[0] = m1;
		memberList[1] = m2;
		
		// 배열 저장소에 저장된 Member 객체 출력
		// -> null 값 제외
		System.out.println("------------------------------------------------");
		for(Member m : memberList) {
			if(m != null) {
				// toString() 메소드가 생략된 상태
				System.out.println(m);				
			}
		}

	}

}
