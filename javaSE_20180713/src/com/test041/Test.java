package com.test041;

public class Test {
	
	//�Ҹ���
	//->��ü �Ҹ�� �ڵ� ȣ��Ǵ� �޼ҵ�.
	//�Ҹ��� ����
	/*
	public void finalize() {
		
	}
	*/
	
	public Test() {
		System.out.println("������ ȣ��!");
	}
	
	public void finalize() {
		System.out.println("�Ҹ��� ȣ��!");
	}

}

