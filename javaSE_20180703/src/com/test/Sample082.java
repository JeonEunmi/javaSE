package com.test;

import java.util.Arrays;

public class Sample082 {

	public static void main(String[] args) {
		
		// ����)
		// �迭 ��� Ž�� �� ����
		
		// 5���� ���� �ڷḦ �����ϴ� �迭 ����
		
		// ������ ������ ä���.
		
		// �迭�� ä���� ���� �ڷ� �߿��� ���� ū ��, ���� ���� ���� �м�
		
		// ��� ���
		// -> �迭 ��� ��ü, ���� ū ��, ���� ���� ��
		
		int [] num = new int[5];
		
		for(int i=0; i<num.length; ++i) {
			num[i] = (int)(Math.random()*101);
		}
		
		int max = 0;
		int min = num[0];
		
		for(int i=0; i<num.length; ++i) {
			if(max < num[i]) {
				max = num[i];
			} else if (min > num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("�迭�� �ִ밪 : " + max);
		System.out.println("�迭�� �ּҰ� : " + min);

	}

}
