package com.test;

public class Sample022 {

	public static void main(String[] args) {

		// if��
		// ���ǹ��� ����� ���� ���๮ ���� ���� ����
		// if (���ǹ�) { ���๮; ... }
		// if~else��
		// if (���ǹ�) { ���๮; ... } else { ���๮; ...}
		// if (���ǹ�) { ���๮; ... } else if (���ǹ�) { ���๮; ...} else { ���๮; ...}


		int a = 10;

		if (a >= 10) {
			System.out.println("a�� 10���� ũ�ų� �����ϴ�.");
			
		}
		
		if( a == 10) {
			System.out.println("a�� 10�Դϴ�.");
		}
		
		/* if ( a = 10 ) {
			Sysetm.out.println("a�� 10�Դϴ�.") 
			//�� �����ڰ��ƴ϶�, ���Կ����ڸ� ��������Ƿ� NO!
		} */  
		

		int b = 15;

		if (b >= 10) {
			System.out.println("b�� 10���� ũ�ų� �����ϴ�.");
		} else {
			System.out.println("b�� 10���� �۴�.");
		}
		
		
		int c = 20;
		
		if (c>10) {
			System.out.println("c�� 10���� Ů�ϴ�");
		} else if (c == 10) { 
			System.out.println("c�� 10�� �����ϴ�.");
		} else {
			System.out.println("c�� 10���� �۴�.");
		}
	}

}

