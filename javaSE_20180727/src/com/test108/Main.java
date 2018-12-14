package com.test108;

public class Main {

	public static void main(String[] args) {
		
		//StringBuffer 클래스
		//->문자열 결합 연산시 메모리에서 쓰레기 객체가 발생하는 것을 방지할 수 있다.
		//->문자열 결합시 + 연산자 대신 StringBuffer 객체의 append() 메소드 사용 권장
		
		// 문자열 결합 연산 -> 기존 방식
		/*
		long start1 = Runtime.getRuntime().freeMemory();
		String temp1 = "";
		for (int a=0; a<1000; ++a) {
			temp1 += "TEST/";
		}
		long end1 = Runtime.getRuntime().freeMemory();
		System.out.println(temp1);
		System.out.println(start1 - end1);
		System.out.println("----------------");
		*/
		
		// 문자열 결합 연산 -> StringBuffer 클래스 이용
		
		long start1 = Runtime.getRuntime().freeMemory();
		StringBuffer temp1 = new StringBuffer();
		for (int a=0; a<1000; ++a) {
			temp1.append("TEST/");
		}
		long end1 = Runtime.getRuntime().freeMemory();
		System.out.println(temp1.toString());
		System.out.println(start1 - end1);
		System.out.println("----------------");
		
	}

}
