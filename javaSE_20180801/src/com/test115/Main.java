package com.test115;

public class Main {

	public static void main(String[] args) {
		
		// ���׸� �޼ҵ尡 �ִ� Box Ŭ������ ���� ��ü ����
		// -> ���ѵ� Ÿ���Ķ���Ϳ� ���� ����� �ڷ��� ���� �ʿ�

		//String �ڷ��� �Ұ� -> Number Ŭ������ ���� �ڷ����� �ƴϴ�.
		// boolean result1 = Box.compare("TEST", "HELLO");
		// System.out.println(result1);
		
		//Integer �ڷ��� ���� -> Number Ŭ������ ���� �ڷ��� �̴�.
		boolean result2 = Box.compare(20, 20);
		System.out.println(result2);
	}

}
