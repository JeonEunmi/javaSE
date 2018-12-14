package com.test;

public class Sample005 {

	public static void main(String[] args) {
		
		//char 자료형
		//문자(Unicode) 저장용 자료형
		//0~65535
		//작은 따옴표 리터럴
		//byte, short, int 자료형과 호환
		//문자 'A'는 메모리에서 2진수 Unicode(0x0041, 65)로 저장된다.
		
		char a = 'A';
		int b = 'A';   //자동 형변환
		char c = 't';  //영문 소문자
		char d = '\t';  //이스케이프 문자
		char e = '\u0041'; //Unicode 문자 (16진수 표기법 넘버링)
		
		int f = 'A' + 1;   //문자와 숫자를 산술적 연산 가능하다. 자동 형변환
		char g = 'A' + 1;   //자동 형변환
		
		System.out.println(a);  //A
		System.out.println(b);  //65
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);  //66
		System.out.println(g);  //B

	}

}
