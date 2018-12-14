package com.test;

public class CoffeeMaker {
	
	//state
	private int bean = 100;
	private int water = 50;
	private int milk = 30;
	
	//bahavior
	public void CafeLatte () {
		bean -= 5;
		milk -= 3;
		if(bean<0) {
			System.out.println("원두가 부족합니다.");
		} else if(milk<0) {
			System.out.println("우유가 부족합니다.");
		} else {
			System.out.println("고객님 카페라떼 한잔 나왔습니다~");
		}
	}
	public void Americano () {
		bean -= 5;
		water -= 5;
		if(bean<0) {
			System.out.println("원두가 부족합니다.");
		} else if(water<0) {
			System.out.println("물이 부족합니다.");
		} else {
			System.out.println("고객님 아메리카노 한잔 나왔습니다~");
		}
	}
	
	//behavior
}
