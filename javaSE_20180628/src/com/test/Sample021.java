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
				
		System.out.println("���� "+ coin + "�� �Ž������� 500��¥�� " + result+ "��, 100��¥�� "+ result1+ "��, 50��¥�� "+ result2+ "��, 10��¥�� "+result3+"�� �Դϴ�.");

	}

}



 