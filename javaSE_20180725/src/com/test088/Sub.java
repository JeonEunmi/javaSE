package com.test088;

// �߻� Ŭ������ ���� ��� ����
public class Sub extends Super{

	// �⺻ ������
	// -> �ڵ� ����
	// -> ȣ�� �� ���������� super() ������ ȣ��
	public Sub() {
		// super();
	}
	
	// �Ϲ� �޼ҵ忡 ���� �������̵� ����
	// -> �������̵� ���� ��� �θ��� ��� �״�� ���
	
	// �߻� �޼ҵ忡 ���� �������̵� �ʼ� 
	@Override
	public void method2() {
		System.out.println("�߻� �޼ҵ忡 ���� ���� �޼ҵ�");
		
	}

}
