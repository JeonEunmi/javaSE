package com.test003;

public class Main {

	public static void main(String[] args) {
		
		//Car Ŭ������ ���� ��ü(instance) ����
		Car c = new Car();
		
		//Car ��ü�� ���(field) ����(�б�)
		// .(dot) ������ - ��ü�� ���� ���(������ ���) ����
		// ���� �ڷ����� ������ �ִ� ������ Ư��
		System.out.println(c.model);
		System.out.println(c.company);
		System.out.println(c.color);
		
		//Car ��ü�� ���(field) ���� ����(����) -> �������� �ʴ� ���
		//������ : ĸ��ȭ
		c.model = "���׷���";
		System.out.println(c.model);
		
		//������ Ŭ������ �̿��ؼ� �������� ��ü(insatance) ����
		//->����� ������ ���°��� ���� ��ü
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.model = "���";
		System.out.println(c1.model);
		System.out.println(c2.model);
	}

}
