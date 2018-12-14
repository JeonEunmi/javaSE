package com.test025;

public class Test {

	//메소드
	
	
	//메소드 선언 형식
	/*
	접근제한자 반환자료형 메소드이름(매개변수){
		실행코드
		return반환값;
		}
	*/
	
	//매개변수 - 메소드 실행시 외부로부터 전달받는 자료를 저장. 성격으로는 로컬 변수
	
	private int a;
	
	//setter
	public void setA (int a) {
		this.a = a;
	}
	
	//getter
	public int getA () {
		return this.a;
	}
	
	//매개변수가 없는 경우
	public void method1() {
		System.out.println("Hello, world!");
	}
	
	//기본 자료형 매개변수
	public void method2(int a) {
		System.out.println(this.a);
		System.out.println(a);
	}
	
	//참조 자료형 매개변수
	public void method3(String a) {
		System.out.println(this.a);
		System.out.println(a);
		
	}
	//매개변수가 여러개 있는 경우 - 갯수 고정
	public void method4(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	//매개변수가 여러개 있는 경우 - 갯수 가변 (가변 매개변수)
	public void method5(int ... args) {
		for(int a = 0; a < args.length; ++a) {
			System.out.println(args[a]);
		}
		
	}
	
}
