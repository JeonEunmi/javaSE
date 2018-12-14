package com.test088;

public class Main {

	public static void main(String[] args) {

		// 추상 클래스의 객체 생성 시도
		// -> 추상 클래스의 객체 생성 불가로 오류발생
		// Super s1 = new Super(); // Cannot instantiate the type Super
		
		Sub sub = new Sub();
		
		sub.method1();
		sub.method2();

		
		// 대표적인 추상 클래스로 Number 클래스가 있다
		/*
		public abstract class Number
			extends Object
			implements Serializable
			
		추상 메소드 -> 하위 클래스에서 각자 기능 구현해서 사용
		abstract int	intValue()
		abstract double doubleValue()
		
		일반 메소드 -> 상위 클래스에서 구현한 기능을 같이 사용
		short	shortValue()
		byte	byteValue()
		*/
		
//		Number n1 = new Number();
		
		Integer n2 = new Integer(10); //int ->Integer ->Boxing
		System.out.println(n2.intValue());	//Integer -> int -> UnBoxing
		System.out.println(n2.shortValue()); //Integer -> short
		
		Number n3 = new Integer(20);
		System.out.println(n3.intValue());	//Number
		System.out.println(n3.shortValue()); //Number
	}

}
