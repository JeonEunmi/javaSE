package com.test031;

public class Main {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("1. ���� �� 1�� ���޽� ���丮�� ���� �� ��� ��ȯ");
		System.out.println("��� : " + t.test(5));
		System.out.println();
		
		System.out.println("2. ���� �� 2�� ���޽� �� ���� �� ��� ��ȯ");
		System.out.println("��� : " + t.test(10, 20));
		System.out.println();
		
		System.out.println("3. �Ǽ� �� 2�� ���޽� �� ���� �� ��� ��ȯ");
		System.out.println("��� : " + t.test(10.0, 20.0));
		System.out.println();

		System.out.println("4. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ (�迭, ���� �Ű����� �� �ϳ�)");
		System.out.println("��� : " + t.test(arr));
		
	}

}