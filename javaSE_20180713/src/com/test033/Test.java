package com.test033;

public class Test {
	
	// 생성자
	// ->객체 생성시 자동 호출되는 메소드. (instance)필드 초기화.
	/*  주의사항 : return문과 void가 없다.
	접근제한자     클래스이름(매개변수) {
		//실행코드
	}
	*/
	
	//기본 생성자
	//-> 매개변수가 없는 생성자
	//-> 자동 제공. 사용자가 생성자 선언을 하지 않은 경우
	
	//**현재는 생성자 선언문이 없으므로 기본생성자가 선언되고 있다.
	//컴파일단계에서 내부적으로 제공되며, (.class) 파일을 열어 확인할 수 있다.

	//필드(field)
	//->동일 자료, 동일 식별자
	private int a;
	
	//getter, setter ->public
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
}
