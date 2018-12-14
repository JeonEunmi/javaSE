package com.test;

public class Sample040 {

	public static void main(String[] args) {
		//구구단 출력
		//임의의 수 (1~9)를 이용해서 구구단 출력
		
		for(int i=1; i<10; ++i) {
			for(int j=1; j<10; ++j) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		//난수발생으로 인한 구구단
		int a = (int)(Math.random()*9)+1;
		for(int i=1; i<10; ++i) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}

}
