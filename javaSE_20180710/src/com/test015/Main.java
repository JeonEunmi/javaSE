package com.test015;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
			
			//숫자 자료 비교
			int a = 10;
			int b = 10;
			int c = 20;
			
			System.out.println(a == b);   //true
			System.out.println(a == c);   //false
			
			//문자열 자료 비교
			String s1 = "TEST";
			String s2 = "TEST";
			String s3 = new String("TEST");
			
			System.out.println(s1 == s2); //참조주소 비교   true
			System.out.println(s1.equals(s2));  //문자열 비교    true
			System.out.println(s1 == s3);      //false
			System.out.println(s1.equals(s3));    //true
			
			//배열 자료 비교
			int[] a1 = {1, 2, 3};
			int[] a2 = {1, 2, 3}; //요소와 순서 모두 동일하므로 true
			int[] a3 = {2, 3, 1}; //요소만 보면 동일해보일지라도 순서가 다르기떄문에 false
			int[] a4 = {1, 2, 3, 4};  //갯수가 다르기 때문에 false
			System.out.println(Arrays.equals(a1, a2));   //true
			System.out.println(Arrays.equals(a1, a3));   //false
			System.out.println(Arrays.equals(a1, a4));   //false
			
			//2차원 배열의 요소인 1차원 배열 자료 비교
			int[][] temp = {{1, 2, 3}, { 1, 2, 3}, {2, 3, 1}};
			int[] t1 = temp[0];
			int[] t2 = temp[1];
			int[] t3 = temp[2];
			System.out.println(Arrays.equals(t1, t2));    //true
			System.out.println(Arrays.equals(t1, t3));    //false
		}
	}

