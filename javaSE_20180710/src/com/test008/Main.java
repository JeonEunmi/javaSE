package com.test008;

// ���� Ŭ���� -> ����() �޼ҵ常 ����
public class Main {

	public static void main(String[] args) {
			
		//Test Ŭ������ plus() �޼ҵ� ȣ��
		//-> Test Ŭ������ ��ü(instance) ���� �ʿ�
		//->plus() �޼ҵ� ���� ����
		Test t = new Test();
		
		//�Ű����� ���Ŀ� �°� �ڷ� ����
		//->��ȯ�� �м�
		int result = t.plus(10, 20);
		System.out.println("���ϱ� : " + result);
		
		
		int result1 = t.substract(30, 10);
		System.out.println(result1);
	}

}
