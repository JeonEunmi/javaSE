package com.test;

public class Sample108 {

	public static void main(String[] args) {

		// n���� �迭 Ž�� �� ����
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		
		//����)
		//�迭 �ȿ� �ִ� ����� ���� �����ϰ� ��� ���
		
		int sum = 0;
		
		System.out.println("�Ϲ� for�� ���");
		for(int i=0; i<a.length; ++i) {   
			for(int j=0; j<a[i].length; ++j) {
				sum += a[i][j];
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------");
		System.out.println(sum);
		System.out.println();
		
		System.out.println("���� for�� ���");
		int total = 0;
		
		for(int[] i : a) {
			for(int j : i) {
				total += j;
				System.out.print(j + " ");
			} 
			System.out.println();
		}
		System.out.println("--------");
		System.out.println(total);
		
	}

}
