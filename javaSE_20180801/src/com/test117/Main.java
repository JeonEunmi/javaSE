package com.test117;

public class Main {

	public static void main(String[] args) {
	
		// SmallBox<T, M> 클래스의 객체 생성
		SmallBox<String, String> smallBox = new SmallBox<String, String> ();
		
		smallBox.setT("M01");
		smallBox.setM("HELLO");
		
		System.out.println(smallBox.getT());
		System.out.println(smallBox.getM());
		
	}

}
