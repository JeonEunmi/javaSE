package com.test;

public class Sample017 {
	
	public static void main(String[] ars) {
		
		// ������
		// �� ������
		// &&, ||, !
		// -> ���� ��� ������ �� �����ϴ�. ����� true or false.
		
		int a = 10;
		
		System.out.println(a);
		System.out.println(a > 10);   // false
		System.out.println(a >= 10);  // true
		
		System.out.println(a > 0 && a < 20);  // true
		System.out.println(a >= 0 && a <= 20);  // true
		
		System.out.println(a % 2 == 0);   // true  
		System.out.println(a % 3 == 0);   // false
		
		int b = 11;
		System.out.println(b % 2 == 0 || b % 3 == 0);   // OR ������ ��� false
		
		System.out.println(!true);   // false
		System.out.println(!false);  // true
	}
}

