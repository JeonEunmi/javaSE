package com.test042;

public class Main {

	
	public static void main(String[] args) {
				
		// ��ü ���� ���� ���� ���� ��� ���� ����
		
		System.out.println(Test.getDept());
		
		Test t1 = new Test("HONG"); // instance�� �ҷ����� ���� new �����ڸ� �̿��� ��ü ����
		System.out.println(t1.getName()); // instance ǥ�� ���
		System.out.println(t1.getDept()); // static �������� �ʴ� ǥ��, but �����߻��� ���� �ʴ´�.
		System.out.println(Test.getDept()); // �����ϴ� ǥ��

	}

}
