package com.test;

public class Sample107 {

	public static void main(String[] args) {

		// n���� �迭 Ž�� �� ����
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };

		// Ư�� ��� Ž���� [�ε���1][�ε���2]
		// [�ε���1] : �� , [�ε���2] : ��
		System.out.println(a[0][0]); // 1
		System.out.println(a[2][3]); // 10

		// n���� �迭 ��� Ž���� ��ø for�� ���
		for (int b = 0; b < a.length; ++b) {
			System.out.println(a[b]); // �迭 ��ü�� �����ּ�
		}

		for (int b = 0; b < a.length; ++b) {
			for (int c = 0; c < a[b].length; ++c) {
				System.out.print(a[b][c]+ " "); //a[0][0], a[0][1], a[0][2]....
			}
		}
		System.out.println(" ");
		
		// n���� �迭 ��� Ž���� ��ø Enhanced for�� ���
		for (int[] b : a) {
			for(int c : b) {
				System.out.print(c + " ");
			}
		} 
	}

}
