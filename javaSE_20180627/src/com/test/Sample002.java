package com.test;

public class Sample002 {

	public static void main(String[] args) {
		
		//int 자료형
		//크기 4byte (32bit)
		//범위 -21억~21억 (-2^31 ~ (2^31)-1  : 2147483647)
		//10진수, 8진수, 16진수 값 저장 가능
		//8진수일 경우 숫자 앞에 '0'을 붙이고, 16진수 일 경우 숫자 앞에 '0x'를 붙인다.
		//예를 들어, 10진수가 255라면 16진수는 0xFF
		
		int a =255;
		int b =0xFF;
		
		int c = a+b;
		
		//상수
		int d = Integer.MAX_VALUE;
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE+10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
