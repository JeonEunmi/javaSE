package com.test;

public class Sample021 {

	public static void main(String[] args) {
		int a = 500;
		int b = 100;
		int c = 50;
		int d = 10;

		int coin = 3760;
		
		int result = coin / a ; 
		int result1 = coin % 500 / b; 
		int result2 = coin % 500 % 100 /c;
		int result3 = coin % 50 / d;
				
		System.out.println("동전 "+ coin + "의 거스름돈은 500원짜리 " + result+ "개, 100원짜리 "+ result1+ "개, 50원짜리 "+ result2+ "개, 10원짜리 "+result3+"개 입니다.");

	}

}



 