package com.test070;

import com.test069.Super;

public class Sub extends Super{

	// Super Ŭ������ ��� �߿��� public, protected
	// Overriding -> ���������ڴ� ������ ���ų�, �а�(public) ����
	
	//protected�� public ���� �а� ���� ����
	@Override
	protected void method3() {
		// TODO Auto-generated method stub
		super.method3();
	}

	//������ public �ε� �������̵� �������� protected�� ���� �Ұ�
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		super.method4();
	}

	
}
