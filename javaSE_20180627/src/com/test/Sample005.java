package com.test;

public class Sample005 {

	public static void main(String[] args) {
		
		//char �ڷ���
		//����(Unicode) ����� �ڷ���
		//0~65535
		//���� ����ǥ ���ͷ�
		//byte, short, int �ڷ����� ȣȯ
		//���� 'A'�� �޸𸮿��� 2���� Unicode(0x0041, 65)�� ����ȴ�.
		
		char a = 'A';
		int b = 'A';   //�ڵ� ����ȯ
		char c = 't';  //���� �ҹ���
		char d = '\t';  //�̽������� ����
		char e = '\u0041'; //Unicode ���� (16���� ǥ��� �ѹ���)
		
		int f = 'A' + 1;   //���ڿ� ���ڸ� ����� ���� �����ϴ�. �ڵ� ����ȯ
		char g = 'A' + 1;   //�ڵ� ����ȯ
		
		System.out.println(a);  //A
		System.out.println(b);  //65
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);  //66
		System.out.println(g);  //B

	}

}
