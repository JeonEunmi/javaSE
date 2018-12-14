package com.test;

import java.util.Arrays;

public class Sample110 {

	public static void main(String[] args) {
		
		// ����)
		// 2���� �迭�� ��� ũ�Ⱑ ���� (3,4,5 ��) �پ��ϴٰ� �����Ҷ�,
		// ������ ����(10~ 20)�� 1���� �迭 ��� (1���� ����������)�� 2���� �迭�� ��ȯ
		/*
		count = 4
		-----------
		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
		-----------
		[1, 2, 3, 4]
		[5, 6, 7, 8]
		[9, 10, 11, 12]
		*/
		int count = 5;
		System.out.println("count : " + count);
		
		int tmp = 0;
		
		do {										// tmp : count���� �°� �������� ��
			tmp = (int)(Math.random()*11)+10;		// tmp���� count�� ����� �ƴϸ� ��� ����
		}while(tmp%count != 0);                     // ����� do-while���� �����
		
		System.out.println("count�� ��� : " + tmp);
		System.out.println("-------------");
				
		int[] a = new int[tmp];						// ���� tmp��ŭ�� �迭 a ����
		
		for(int i=0; i<a.length; ++i) {				// 1���� tmp ������ ���� ���������� �迭 a�� ����
			a[i] = i+1;
		} 
		
		System.out.println(Arrays.toString(a));
		System.out.println("-------------");
		int count2 = a.length / count;				// count2 -> �� ���� (��ü���� / ���ٿ� ���� ����)
		int[][] b = new int [count2][];				// count2 �� ��ŭ�� ������ �迭 b ����
		
		for(int i =0; i<b.length; ++i) {
			b[i] = Arrays.copyOfRange(a, i*count, i*count+count); 	// �迭 b�� count ��ŭ �ɰ��� ����
		}

		for(int i=0; i<b.length; ++i) {
		System.out.println(Arrays.toString(b[i]));		// ������ �迭 b�� ����Ʈ
		}
	}

}
