package com.test;

public class Sample002 {

	public static void main(String[] args) {
		
		//int �ڷ���
		//ũ�� 4byte (32bit)
		//���� -21��~21�� (-2^31 ~ (2^31)-1  : 2147483647)
		//10����, 8����, 16���� �� ���� ����
		//8������ ��� ���� �տ� '0'�� ���̰�, 16���� �� ��� ���� �տ� '0x'�� ���δ�.
		//���� ���, 10������ 255��� 16������ 0xFF
		
		int a =255;
		int b =0xFF;
		
		int c = a+b;
		
		//���
		int d = Integer.MAX_VALUE;
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE+10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
