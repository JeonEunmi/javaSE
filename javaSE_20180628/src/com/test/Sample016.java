package com.test;

public class Sample016 {

	public static void main(String[] args) {
		
		// ������
		// ���ڿ� ���� ������
		// +
		// ���ڿ�(String) + �ٸ� �ڷ����� �� => ���ڿ�
		// ����� ȭ��� ����� �� ����Ѵ�. 
		
	      int a = 10;
	      int b = 20;

	      System.out.println("a == b �� �����ϸ� " + (a == b) + "�Դϴ�.");
	      System.out.println("a != b �� �����ϸ� " + (a != b) + "�Դϴ�.");
	      System.out.println("a > b �� �����ϸ� " + (a > b) + "�Դϴ�.");
	      System.out.println("a < b �� �����ϸ� " + (a < b) + "�Դϴ�.");
	      System.out.println("b >= a �� �����ϸ� " + (b >= a) + "�Դϴ�.");
	      System.out.println("b <= a �� �����ϸ� " + (b <= a) + "�Դϴ�.");	
	      
	      String str1 = "JDK" + 3 + 3.0;   //JDK33.0
	      String str2 =  3 + 3.0 + "JDK";   //6.0JDK
	      
	      System.out.println();
	      System.out.println(str1);
	      System.out.println(str2);
	}

}

 