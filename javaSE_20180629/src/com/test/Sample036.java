package com.test;

public class Sample036 {

	public static void main(String[] args) {
		
		// ����(����) 0 ~ 100 �м�
		int score = (int)(Math.random()*101);
		
		System.out.println("���� : " + score);
		
		switch (score/10) {
		case 10 :
		case 9 :
			System.out.println("A����Դϴ�.");
			break;
		case 8 :
			System.out.println("B����Դϴ�.");
			break;
		case 7 :
			System.out.println("C����Դϴ�.");
			break;
		case 6 :
			System.out.println("D����Դϴ�.");
			break;
		default :
			System.out.println("F����Դϴ�.");
		}
		
		/*		 
		if(score>=90) {
			System.out.println("A����Դϴ�.");
		} else if (score>=80) {
			System.out.println("B����Դϴ�");
		} else if (score>=70) {
			System.out.println("C����Դϴ�");
		} else if (score>=60) {
			System.out.println("D����Դϴ�.");
		} else {
			System.out.println("F����Դϴ�.");			
		}
		*/
	}

}
