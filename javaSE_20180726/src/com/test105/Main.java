package com.test105;

public class Main {

	//main() 메소드는 throws 구문 사용을 권장하지 않는다.
	//->try~catch 구문 사용
	public static void main(String[] args) {
		
		//Sub 클래스의 객체 생성
		Sub sub = new Sub();
		
		//메소드 내에서 예외 발생 가능성 존재
		//->try~catch 구문 사용하는 메소드
		sub.method1();
		
		//메소드 내에서 예외 발생 가능성 존재
		//->throws 구문 사용하는 메소드
		try {
			sub.method2();
		}catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error101: 잘못된 액션입니다.");
		}
		
		System.out.println("프로그램 종료.");

	}

}
