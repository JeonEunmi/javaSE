package com.test;

public class Sample077 {

	public static void main(String[] args) {
		
		// �迭 ����Ҹ� �̿��� ���� ó��
		// �ټ��� ����ڿ� ���� �������� �����ϰ� ��, ��� ���� ����Ͽ� �����
		// ����� �� ��� ���� 1���� ���� - ����1�� ���� ����
		/* park, kim, lee�� ����
		 * park : 100
		 * kim : 90
		 * lee : 85
		 */
		
		// ���� ¦�� �¾ƾ� �ϴ� �ڷ��� �ε����� ��ġ��ų ��
		String[] names = {"park", "kim", "lee"};
		int[] scores = {100, 90, 85};
		
		
		// ����, ��� ��� �׼� 
		int sum = 0;
		double avr = 0.0;
		
		for(int i=0; i<names.length; ++i) {
			sum += scores[i];
		}
		
		avr = (double) sum / scores.length;
		
		// System.out.println(Arrays.toString(names))
		// ��� ���
		for(int i = 0; i < names.length; ++i) {
		System.out.println(names[i] + "�� ������ ?? " + scores[i]);
		}
		
		System.out.println("--------------------");		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avr);
		
		/*
		 * ���࿹)
		 * park�� ������ ?? xx
		   kim�� ������ ?? xx
		   lee�� ������ ?? xx
		  ---------------------
		  ���� : xxxx
		  ��� : xxx.xxx
		 */
	}

}
