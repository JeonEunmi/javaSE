package com.test;

public class Sample016 {

	public static void main(String[] args) {
		
		// 연산자
		// 문자열 연결 연산자
		// +
		// 문자열(String) + 다른 자료형의 값 => 문자열
		// 결과를 화면상에 출력할 때 사용한다. 
		
	      int a = 10;
	      int b = 20;

	      System.out.println("a == b 을 수행하면 " + (a == b) + "입니다.");
	      System.out.println("a != b 을 수행하면 " + (a != b) + "입니다.");
	      System.out.println("a > b 을 수행하면 " + (a > b) + "입니다.");
	      System.out.println("a < b 을 수행하면 " + (a < b) + "입니다.");
	      System.out.println("b >= a 을 수행하면 " + (b >= a) + "입니다.");
	      System.out.println("b <= a 을 수행하면 " + (b <= a) + "입니다.");	
	      
	      String str1 = "JDK" + 3 + 3.0;   //JDK33.0
	      String str2 =  3 + 3.0 + "JDK";   //6.0JDK
	      
	      System.out.println();
	      System.out.println(str1);
	      System.out.println(str2);
	}

}

 