package com.test043;

public class Main {

	public static void main(String[] args) {

		int a = 11;
		int b = 6;
		
		//minFunction() �޼ҵ�� static �޼ҵ� �̹Ƿ� ��ü ���� ���� ���� �ٷ� ȣ�� ����
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
	}

	/** returns the minimum of two numbers */
	private static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;

	}
}
