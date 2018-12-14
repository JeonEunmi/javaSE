package com.test009;

//물리적 계산기를 소프트웨어 객체로 표현
public class Calculator {

	//계산기 행동적 특성 분석
	//->전원 on/off, 더하기 연산, 빼기 연산
	//->method
	
	//계산기 상태 분석
	//->전원 on/off 상태값 저장 변수 필요
	//->field
	private boolean power;

	//0 꺼짐 1 켜짐
	
	//전원 on/off 메소드
	public void power() {
		this.power = !this.power;
		
	}
	
	//더하기 연산 메소드 -> 전원 on 상태 확인 필요
	public String plus(int a, int b) {
		String result = "";
		if(this.power) {
			//산술 연산의 결과인 int를 메시지(String)으로 변환
			//->String.valueOf()
			result = String.valueOf(a + b);
		}
		return result;
	}
	
	//빼기 연산 메소드 -> 전원 on 상태 확인 필요
	
	public String substract(int c, int d) {
		String result1 = "";
		if(this.power) {
			result1 = String.valueOf(c - d);
		}
		return result1;
	}
}
