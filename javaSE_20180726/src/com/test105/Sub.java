package com.test105;

public class Sub {
	
	public void method1() {
		
		//예외 발생 가능성 있는 코드 작성
		//try~catch 구문은 예외에 대한 자체 해결
		try {
			String s = null;
			System.out.println(s.length()); //NullPointerException
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Error999: 기타 오류.");
		}
		
		System.out.println("서브액션 종료.");
		
	}
	
	//서브 액션 메소드는 throws 구문 사용 가능
	//->throws 구문 뒤에 예외의 종류 나열 또는 상위 예외 지정
	public void method2() throws ClassNotFoundException {
		
		//예외 발생 가능성 있는 코드 작성
		//->Checked Exception 종류로 준비
		//throws 구문은 예외에 대한 위임(떠넘기기)
		Class temp = Class.forName("java.lang.String");

	}

}
