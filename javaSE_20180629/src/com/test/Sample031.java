package com.test;

public class Sample031 {

	public static void main(String[] args) {
		
		// ����
		// ������ �Ǽ�(0�̻�~1�̸�)�� ���� ����
		// 0.0000 ~ 0.99999
		// Math Ŭ������ random() �޼ҵ�
		
		System.out.println(Math.random());
		
		// ���� -> �Ǽ� -> ����ȭ -> ���� ���� �ʿ�
		// 0.0000 ~ 0.99999 *100  -> 0.0000 ~ 99.999 -> (int) ���� ����ȭ -> 0 ~ 99
		
		System.out.println((int)(Math.random() * 101));
		
		// �ֻ��� ������ ���� ���� �߻�
		// 1~6
		System.out.println((int)(Math.random() * 6) + 1);
		
		// �ζ� ������ ���� ���� �߻�
		// 1~45
		System.out.println((int)(Math.random() * 45) + 1);
	}
}
