package com.dog;

// 실세계의 강아지(State, behavior)에 대한 소프트웨어 객체로 표현하는 과정
// -> Dog Class
public class Dog {
	
	public void state() {
		System.out.println("훈련 전");
		System.out.println();
	}

	public void barking() {
		// 액션코드
		System.out.println("주인 : 짖지마");
		System.out.println("강아지 : 멍멍! 멍멍!!");
	};
	
	public void roll() {
		System.out.println("주인 : 굴러!");
		System.out.println("강아지 : 안해! 못해!");
	};
	
	public void hand() {
		System.out.println("주인 : 손!");
		System.out.println("강아지 : 손이 뭐야 ? 먹는거야? 헥헥");
		System.out.println();
	};
	
	
}
