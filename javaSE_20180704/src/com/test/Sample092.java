package com.test;

import java.util.Arrays;

public class Sample092 {

	public static void main(String[] args) {
		
		//�⺻ �ڷ��� �迭�� ���� �ڷ��� �迭
		/*int[] a = new int[5];
		
		for(int b =0; b<a.length; ++b) {
			a[b] = (int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(a));
		*/
		
		//����)
		//������ ������ ���ڿ��� ���� ����
		//byte �ڷ����� �迭 �غ� -> ũ�� ����
		//byte �迭�� ���� ������ ���� -> ������ ����(A ~ Z)
		//byte �迭�� ���ڿ��� ��ȯ
		
		String[] c = new String[5];
		
		for(int d=0; d<c.length; ++d) {
			byte [] tmp1 = new byte [5];
		
			for(int i=0; i<tmp1.length; ++i) {
				tmp1[i] = (byte)((Math.random()* 26) + 65);			
				}
			
			c[d] = new String(tmp1);
		}
		
		System.out.println(Arrays.toString(c));
		
		

	}

}
