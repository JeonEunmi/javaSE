package com.test;

public class Sample035 {

	public static void main(String[] args) {
		// switch ����
		// -> �� ���� �߿� ������ ���ϴ� ���길 �����ϴ�.
		/*
		 switch(expression) {
   			case value :
      			// Statements
      		break; // optional
   
   			case value :
      			// Statements
      		break; // optional
   
   		// You can have any number of case statements.
   		default : // Optional  ��������
      		// Statements
		}
		 */

		// �ֻ��� ���� ������ �����߻�
		int a = (int)(Math.random()*6)+1;

		switch(a) {
		case 1 :
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2 :
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3 :
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4 :
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5 :
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		default :
			System.out.println("6���� ���Խ��ϴ�.");

		}
	}

}
