package com.test112;

public class Main {

	public static void main(String[] args) {

		// Box<T> 클래스에 대한 객체 생성
		// -> 타입파라미터에 대한 명시적 자료형 지정 필요

		// String으로 지정한 경우
		Box<String> box1 = new Box<String>("TEST");
		System.out.println(box1.getT()); // "TEST"

		// Integer로 지정한 경우
		Box<Integer> box2 = new Box<Integer>(10);
		System.out.println(box2.getT()); // 10

		// int로 지정한 경우 -> 기본자료형은 불가 -> wrapper class로 대체
		// Box<int> box3 = new Box<int>(10);
		// System.out.println(box3.getT()); //10

	}

}
