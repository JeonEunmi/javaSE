package com.test;

public class Sample040 {

	public static void main(String[] args) {
		//������ ���
		//������ �� (1~9)�� �̿��ؼ� ������ ���
		
		for(int i=1; i<10; ++i) {
			for(int j=1; j<10; ++j) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		//�����߻����� ���� ������
		int a = (int)(Math.random()*9)+1;
		for(int i=1; i<10; ++i) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}

}
