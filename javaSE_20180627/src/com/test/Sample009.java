package com.test;

public class Sample009 {

	public static void main(String[] args) {
		// �Ǽ� �ڷ��� ��޽� ����
		
		int apple = 1;
		double piecesUnit = 0.1;
		int number = 7;
		
		double result = apple - (number * piecesUnit);  // 1-(7*0.1) = 1-0.7 = 0.3
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result+ " ������ ���´�.");
		System.out.println();
		System.out.println("------------  ������������ ���� �� �ٽ� ���");
		
		
		int apple1 = 1;
		int totalPiece = apple1 * 10;
		int number1 = 7;
		int tmp = totalPiece - number1;
		
		double result1 = tmp/10.0;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result1+ " ������ ���´�.");

	}

}

