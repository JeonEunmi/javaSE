package com.dog;

// �Ǽ����� ������(State, behavior)�� ���� ����Ʈ���� ��ü�� ǥ���ϴ� ����
// -> Dog Class
public class Dog {
	
	public void state() {
		System.out.println("�Ʒ� ��");
		System.out.println();
	}

	public void barking() {
		// �׼��ڵ�
		System.out.println("���� : ¢����");
		System.out.println("������ : �۸�! �۸�!!");
	};
	
	public void roll() {
		System.out.println("���� : ����!");
		System.out.println("������ : ����! ����!");
	};
	
	public void hand() {
		System.out.println("���� : ��!");
		System.out.println("������ : ���� ���� ? �Դ°ž�? ����");
		System.out.println();
	};
	
	
}
