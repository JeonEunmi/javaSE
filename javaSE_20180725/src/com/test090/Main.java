package com.test090;

public class Main {

	public static void main(String[] args) {
		// 익명 구현 객체 이용
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
			
		};
				
				
		action.work();
	}

}
