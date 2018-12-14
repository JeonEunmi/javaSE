package com.test;

public class Sample003 {
	
	public static void main(String[] args) {
		// int 자료형 MAX + 1 값을 int 자료형에 저장
		
		int max = Integer.MAX_VALUE;
		
		int a = Integer.MAX_VALUE+1;
		int b = Integer.MAX_VALUE+10;
		
		System.out.println(max); //2147483647
		System.out.println(a);  //2147483648?? no! -2147483648
		System.out.println(b);  //2147483658?? no! -2147483639
		
	}

}
