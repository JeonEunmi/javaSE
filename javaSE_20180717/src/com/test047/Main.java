package com.test047;

public class Main {

	public static void main(String[] args) {

		// final field -> 수정 불가 항목

		// 초기화
		Test t = new Test();

		// 수정 가능
		t.setName("HONG");
		// 읽기 가능
		System.out.println(t.getName());

		// 수정 불가
		// t.setDept("TEST");
		
		// 읽기 가능
		System.out.println(t.getDept());
	}
}
