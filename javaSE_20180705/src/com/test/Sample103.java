package com.test;

public class Sample103 {

	public static void main(String[] args) {
		// 객체를 참조하는 배열
		// -> 자료형이 참조형(String)인 배열
		
		String[] a = {"park", "choi", "hong"};
		
		// 참조주소 비교
		System.out.println(a[0] == a[1]);   //false
		
		// 자료(문자열) 비교
		System.out.println(a[0].equals(a[1]));  //false
		
		
		String[] b = new String[3];
		
		b[0] = "park";
		b[1] = "park";
		b[2] = new String("park");
		
		System.out.println(b[0] == b[1]);  //true
		System.out.println(b[0] == b[2]);  //false
		System.out.println(b[0].equals(b[1]));   //true
		System.out.println(b[0].equals(b[2]));   //true
	}

}
