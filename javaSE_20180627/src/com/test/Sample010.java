package com.test;

public class Sample010 {

	public static void main(String[] args) {
		
		//����ó�� -> ����1, ����2, ����3�� ������ ���� ���� ���
		
		//1�ܰ�. �Է�
		//���� ���� �� �� ����
		//-> �ڷ���
		byte sub1 = 90;
		byte sub2 = 68;
		byte sub3 = 62;
		//byte sub4 = 200; // max 127
		
		//2�ܰ�. ó��
		//���� ��� �׼� �ڵ�
		int total = sub1 + sub2 + sub3;
		
		//��� ��� �׼� �ڵ�
		//������ ������ ���� ����� ����
		//double avg = total / 3;
		//������ �Ǽ��� ���� ����� �Ǽ�
		double avg = total / 3.0;
				
		//3�ܰ�. ���
		//���� ��� ��� �ڵ�
		System.out.println(total);
		//��� ��� ��� �ڵ�
		System.out.println(avg);
	}

}

