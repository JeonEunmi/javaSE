package com.test009;

public class Main {

	public static void main(String[] args) {
		
		//Calculator Ŭ������ ���� ��ü(instance) ����
		Calculator cal = new Calculator();
		
		//���� on/off ���� Ȯ�� ���� �ٷ� ȣ���� ���
		System.out.println(cal.plus(40, 5));   //35
		
		//���� on
		cal.power();
		
		//��� ����
		System.out.println(cal.plus(10, 20));   //30
		System.out.println(cal.substract(30, 10));   //20
		
		//���� off
		cal.power();
		
		//���� off���¿��� ����
		System.out.println(cal.plus(60, 20));    //80
		
		//���� on
		cal.power();
		
		//��� ����
		System.out.println(cal.substract(50, 20));   //30
	}

}
