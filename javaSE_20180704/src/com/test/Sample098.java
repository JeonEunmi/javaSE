package com.test;

import java.util.Arrays;

public class Sample098 {

	public static void main(String[] args) {
		// 배열 항목 비교

		int[] a = { 20, 50, 10, 40, 30 };
		int[] b = { 10, 20, 30, 40, 50 };

		System.out.println(a.equals(b)); // false

		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a.equals(b)); // false
		// 값은 같으나, 참조주소가 다르기때문에 false값이 나온다.
		// 항목 간 비교가 아니라, 참조주소 비교 -> String 과 다름에 주의

		int[] c = b;
		// 참조주소가 일치하므로 true
		System.out.println(b.equals(c)); // true

		String d = new String("HELLO");
		String e = new String("HELLO");
		System.out.println(d == e);   // 주소 비교 false
		System.out.println(d.equals(e));   //값 비교 -> true
		
		
	}

}
