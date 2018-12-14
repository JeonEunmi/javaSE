package com.test;

public class Sample004 {
	public static void main(String[] args) {
		
		//long 자료형
		//크기 8byte, 64bit
		//접미사 L 표시 필요.
		
		long a = 10L;
		long b = 10;  //자동 형변환 실행
		
		//int c = 2_147_483_648;      int형에 어울리지 않는 큰 숫자입니다.
		//long d = 2_147_483_648;
		//int형 범위를 초과하는 리터럴이라 오류발생, 꼭 접미사 'L'을 붙여줘야한다. 자동 형변환 불가
		long e = 2_147_483_648L;    
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		
	}
}
