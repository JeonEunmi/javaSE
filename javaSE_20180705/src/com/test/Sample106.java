package com.test;

import java.util.Arrays;

public class Sample106 {

	public static void main(String[] args) {
		
		// ������ �迭 (�迭�� �迭)
		
		// 1���� �迭
		int[] a = {10, 20, 30};
		System.out.println(Arrays.toString(a));
		
		// n���� �迭 (�迭�� �迭)
		int[][] b = new int[2][3];  //������ ����
		
		// ���� ����, Arrays.toString() �޼ҵ�� 1���� �迭�� ��� ����
		System.out.println(Arrays.toString(b)); 
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));
		
		// n���� �迭(�迭�� �迭) 
		int[][] c = new int [2][];  //����������;
		c[0] = new int[2];
		c[1] = new int[3];
				
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c[0]));
		System.out.println(Arrays.toString(c[1]));
				
		//n���� �迭 (�迭�� �迭)
		int[][] d = {{1,2}, {3,4}, {5,6,7}};
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(d[0]));
		System.out.println(Arrays.toString(d[1]));
		System.out.println(Arrays.toString(d[2]));
		
		//length field�� �迭�� ��� ������ ��ȯ. ��, 1������
		System.out.println(d.length);
		System.out.println(d[0].length);
		System.out.println(d[2].length);
		}
	} 

