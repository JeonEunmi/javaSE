package com.test114;

public class Main {

	public static void main(String[] args) {
		
		// ���׸� �޼ҵ尡 �ִ� Box Ŭ������ ���� ��ü ����
		// -> Ÿ���Ķ���Ϳ� ���� ����� �ڷ��� ���� �ʿ�

		//String �ڷ��� (�Ͻ���) ������ ���
		boolean result = Box.compare("TEST", "HELLO");
		System.out.println(result);
		
		//Integer �ڷ��� (�����) ������ ���
		boolean result2 = Box.<Integer>compare(20, 20);
		System.out.println(result2);
	}

}
