package com.test;

public class Sample020 {

	public static void main(String[] args) {
		
		// ������
		// ���� ������ (���� ������)
		// (���ǽ�) ? ��1 : ��2
		// ���ǽ��� ����� ���̸� ��1 ��ȯ
		// ���ǽ��� ����� �����̸� ��2 ��ȯ
		
		int a = 10;
		System.out.println(a);
		System.out.println((a > 10) ? "a�� 10���� Ů�ϴ�" :"a�� 10���� �۰ų� �����ϴ�");
		
		// ���� a1, a2, a3�� ������ �ִٰ� ����
		// ���� ū ������ ��� �ִ� ���� �̸� (���ڿ�, String) ���
		int a1 = 40;
		int a2 = 50;
		int a3 = 30;
		
		String result = "";
		result = (a1 > a2) ? "a1" : "a2";
		int tmp = 0;
		tmp = (a1 > a2) ? a1 : a2;
		String result2 = "";
		result2 = (tmp > a3) ? result : "a3";
		
		System.out.println(result2);
		
		System.out.println((a1 > a2) ? "a1" : (a2 > a3) ? "a2" : "a3");   // �� ����İ� ����
	}

}

 