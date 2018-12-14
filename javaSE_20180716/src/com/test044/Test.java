package com.test044;

public class Test {
	
	// 정적(static) 초기화 블록
	// -> 정적(static) 멤버(field)의 초기화를 담당하는 코드 블록
	
	// -> 정적 멤버는 외부 자료에 의해서 초기화되지 않는다. 자동, 명시적 초기화 사용
	// -> 명시적 초기화는 복잡한 코드를 작성할 수 없다.
	// -> 초기화 블록 사용 시 복잡한 코드에 의한 초기화 가능
	
	//형식
	/*
	static {
		// 실행코드
	}
	*/
	
	private int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	// 정적 초기화 블록
	// -> 1부터 10까지의 수 중에서 난수로 채운 경우
	// -> 반복문 코드 필요
	private static int[] c = new int[10];
	
	static {
		for(int i = 0; i < c.length; i++) {
			Test.c[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public int[] getA() {
		// 참조주소 반환
		return this.a;
	}
	
	public static int[] getB() {
		// 참조주소 반환
		return Test.b;
	}
	
	public static int[] getC() {
		return Test.c;
	}
}
