package com.test;

public class Sample001 {

	public static void main(String[] args) {
		
		//����ó�� -> ����1, ����2, ����3�� ������ ���� ���� ���
		
		//1�ܰ�. �Է�
		//���� ���� �� �� ����
		//-> �ڷ���
		byte sub1, sub2, sub3;
		sub1 = 90;
		sub2 = 65;
		sub3 = 80;
		//byte sub4 = 200; // max 127
		
		//2�ܰ�. ó��
		//���� ��� �׼� �ڵ�
		int total = sub1 + sub2 + sub3;
				
		//3�ܰ�. ���
		//���� ��� ��� �ڵ�
		System.out.println(total);
	}

}

