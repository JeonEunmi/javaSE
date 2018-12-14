package com.test097;

public class NullPoint {

	public static void main(String[] args) {
		
		// 예외(Exception)
		// -> 잘못된 자료 또는 조작에 의해 발생하는 오류
		// -> 적절한 처리(예외 처리)를 통해서 비정상 종료를 막을 수 있다.
		// checked Exception / unchecked Exception (Runtime Exception)
		
		
		String s1 = new String ("TEST");
		System.out.println(s1.length());
		
		String s2 = null;
		// 예외 처리 코드
		// -> 예외가 발생하더라도 비정상 종료를 막을 수 있다
		try {
			// 예외 발생 가능성이 있는 코드 작성
			/*
			String 클래스의 length() 메소드 시그니처
			public int length()
			*/
			System.out.println(s2.length());   // NullPointerException -> unchecked Exception	
		} catch(Exception e){
			// 예외 발생 시 조치 사항 작성
			// -> 예외 메세지 출력
			e.printStackTrace();
		}
		
		// 실행 불가 -> 중간에 발생한 예외로 인해 실행 불가
		// 적절한 예외처리가 없다면 실행 불가
		// -> 중간에서 발생한 예외로 인해 비정상 종료
		System.out.println("프로그램 종료");
	}
}
