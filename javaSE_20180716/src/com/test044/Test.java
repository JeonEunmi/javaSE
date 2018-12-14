package com.test044;

public class Test {
	
	// ����(static) �ʱ�ȭ ���
	// -> ����(static) ���(field)�� �ʱ�ȭ�� ����ϴ� �ڵ� ���
	
	// -> ���� ����� �ܺ� �ڷῡ ���ؼ� �ʱ�ȭ���� �ʴ´�. �ڵ�, ����� �ʱ�ȭ ���
	// -> ����� �ʱ�ȭ�� ������ �ڵ带 �ۼ��� �� ����.
	// -> �ʱ�ȭ ��� ��� �� ������ �ڵ忡 ���� �ʱ�ȭ ����
	
	//����
	/*
	static {
		// �����ڵ�
	}
	*/
	
	private int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	// ���� �ʱ�ȭ ���
	// -> 1���� 10������ �� �߿��� ������ ä�� ���
	// -> �ݺ��� �ڵ� �ʿ�
	private static int[] c = new int[10];
	
	static {
		for(int i = 0; i < c.length; i++) {
			Test.c[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public int[] getA() {
		// �����ּ� ��ȯ
		return this.a;
	}
	
	public static int[] getB() {
		// �����ּ� ��ȯ
		return Test.b;
	}
	
	public static int[] getC() {
		return Test.c;
	}
}
