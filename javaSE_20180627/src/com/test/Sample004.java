package com.test;

public class Sample004 {
	public static void main(String[] args) {
		
		//long �ڷ���
		//ũ�� 8byte, 64bit
		//���̻� L ǥ�� �ʿ�.
		
		long a = 10L;
		long b = 10;  //�ڵ� ����ȯ ����
		
		//int c = 2_147_483_648;      int���� ��︮�� �ʴ� ū �����Դϴ�.
		//long d = 2_147_483_648;
		//int�� ������ �ʰ��ϴ� ���ͷ��̶� �����߻�, �� ���̻� 'L'�� �ٿ�����Ѵ�. �ڵ� ����ȯ �Ұ�
		long e = 2_147_483_648L;    
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		
	}
}
