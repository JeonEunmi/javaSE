package com.test;

public class CoffeeMaker {
	
	//state
	private int bean = 100;
	private int water = 50;
	private int milk = 30;
	
	//bahavior
	public void CafeLatte () {
		bean -= 5;
		milk -= 3;
		if(bean<0) {
			System.out.println("���ΰ� �����մϴ�.");
		} else if(milk<0) {
			System.out.println("������ �����մϴ�.");
		} else {
			System.out.println("���� ī��� ���� ���Խ��ϴ�~");
		}
	}
	public void Americano () {
		bean -= 5;
		water -= 5;
		if(bean<0) {
			System.out.println("���ΰ� �����մϴ�.");
		} else if(water<0) {
			System.out.println("���� �����մϴ�.");
		} else {
			System.out.println("���� �Ƹ޸�ī�� ���� ���Խ��ϴ�~");
		}
	}
	
	//behavior
}
