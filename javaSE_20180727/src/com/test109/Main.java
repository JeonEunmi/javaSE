package com.test109;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Random Ŭ����
		// -> ���� �߻�
		// -> Ư�� ���� ���� ���� �߻��� nextInt() �޼ҵ� ���
		
		// �ζ� ��ȣ ���� �߻� -> ���� ���
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*45) + 1);
		}
		System.out.println("========================");
		// �ζ� ��ȣ(1~45) ���� �߻� -> Random Ŭ������ nextInt() �޼ҵ�
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(45)+1);
		}
	}

}
