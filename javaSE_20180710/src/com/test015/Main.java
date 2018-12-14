package com.test015;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
			
			//���� �ڷ� ��
			int a = 10;
			int b = 10;
			int c = 20;
			
			System.out.println(a == b);   //true
			System.out.println(a == c);   //false
			
			//���ڿ� �ڷ� ��
			String s1 = "TEST";
			String s2 = "TEST";
			String s3 = new String("TEST");
			
			System.out.println(s1 == s2); //�����ּ� ��   true
			System.out.println(s1.equals(s2));  //���ڿ� ��    true
			System.out.println(s1 == s3);      //false
			System.out.println(s1.equals(s3));    //true
			
			//�迭 �ڷ� ��
			int[] a1 = {1, 2, 3};
			int[] a2 = {1, 2, 3}; //��ҿ� ���� ��� �����ϹǷ� true
			int[] a3 = {2, 3, 1}; //��Ҹ� ���� �����غ������� ������ �ٸ��⋚���� false
			int[] a4 = {1, 2, 3, 4};  //������ �ٸ��� ������ false
			System.out.println(Arrays.equals(a1, a2));   //true
			System.out.println(Arrays.equals(a1, a3));   //false
			System.out.println(Arrays.equals(a1, a4));   //false
			
			//2���� �迭�� ����� 1���� �迭 �ڷ� ��
			int[][] temp = {{1, 2, 3}, { 1, 2, 3}, {2, 3, 1}};
			int[] t1 = temp[0];
			int[] t2 = temp[1];
			int[] t3 = temp[2];
			System.out.println(Arrays.equals(t1, t2));    //true
			System.out.println(Arrays.equals(t1, t3));    //false
		}
	}

