package com.test;

public class Sample011 {
	
	public static void main(String[] args) {
		
		// ����ȯ -> ���� �ڷ����� �ٸ� �ڷ������� �ٲ۴�.
		// ����(�����), �ڵ�(�Ͻ���)
		// �ڷ��� ���� ������ ���� ���� �ٸ� �� ����ȯ �߻�
		
		// �ڵ� ����ȯ
		// -> ���� �ڷ����� ���� ū �ڷ����� ������ ����
		
		int a = 10; // int�� ���� = int�� �ڷ�; -> �̷����� ����ȯ�� �߻����� �ʴ´�.
		
		long b = 10; // long�� ���� = int�� �ڷ�; -> �ڵ� ����ȯ �߻�
		
		// int c = l0L;
		// int�� ���� = long�� �ڷ�; ->type mismatch!! ���� ����ȯ �ʿ�
		
		int d = 'A';  //�ڵ� ����ȯ
		char e = 65;  //�ڵ� ����ȯ
		
		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = b1+b2;  // ���� ���� ����� ����� int��
		
		int i1 = 10;
		int i2 = 20;
		int i3 = i1+i2;
		
		int d1 = 10;
		// int d2 = d1 / 3.0;  //����, �Ǽ� ���� ����� ����� double��
		double d3 = d1 / 3.0;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);  //65
		System.out.println(e);  //A
		System.out.println(i3);
		System.out.print(d3);
						
	}
}
