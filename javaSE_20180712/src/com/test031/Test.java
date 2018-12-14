package com.test031;

public class Test {

	// �޼ҵ� �����ε�(Method Overloading) - ������ ����� �������� �ۼ��Ҷ�
	// �޼ҵ� �̸�, �Ű����� �ڷ���, �Ű����� ������ ��ġ�ϴ� �޼ҵ尡 ������ ����ȴ�.
	// ���� ���, println() �޼ҵ�� �޼ҵ� �����ε� �����̴�.
	
	// �ܺο��� ���޹޴� �ڷ��� ���°� �پ��ϰ� ����ǵ��� �޼ҵ带 �����Ѵ�.
	// 1. ���� �� 1�� ���޽� ���丮�� ���� �� ��� ��ȯ
	// 2. ���� �� 2�� ���޽� �� ���� �� ��� ��ȯ
	// 3. �Ǽ� �� 2�� ���޽� �� ���� �� ��� ��ȯ
	// 4. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ (�迭, ���� �Ű����� �� �ϳ�)
	
	public int test(int a) {
		int result = 1;
		for(int i = 0; i < a; i++) {
			result  *= (a-i);
		}
		return result;
	}
	
	public int test(int a, int b) {
		int result = 0;
		result = a + b;	
		return result;
	}
	
	public double test(double a, double b) {
		double result = a + b;
		return result;
	}
	
	/*
	public int test(int ... args) {
		int result = 0;
		for(int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}*/
	
	public int test(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

}
