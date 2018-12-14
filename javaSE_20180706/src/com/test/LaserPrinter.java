package com.test;

//프린터에 대한 클래스 정의
public class LaserPrinter {
	
	// state = toner, paper, ... -> field
	// 토너, 종이가 공급(setter)되면 외부에서 전달된 메세지를 종이에 출력
	// 수치적인 정보 = 상태값 
	private int toner = 50;
	private int paper = 5;
	
	//behavior -> writing(), ... -> method
	public void writing(String msg) {
		// 상태값 확인
		// -> 토너 부족, 종이 부족
		if(toner < msg.length()) {			// toner 양 검사
			System.out.println("토너 부족!");
		} else if(paper == 0) {		// paper 양 검사
			System.out.println("종이 부족!");
		} else {
			// 액션코드
			System.out.println(msg);
		}
		
		// 상태값 변화
		// -> 글자수만큼 토너 감소, 메세지 1개당 종이 1장 소모
		toner -= msg.length();
		--paper;
	}
	//	setter : 외부로부터 공급받는 방법 중 하나 (p.265 참고)		
}
