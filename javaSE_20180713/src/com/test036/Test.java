package com.test036;

public class Test {

	//������ �����ε�(Overloading)
	//->�����ڰ� ������ ����� ����
	//������ ����
	/*
	���������� Ŭ�����̸�(�Ű�����) {
		//�����ڵ�
	}
	*/
	
	//�Ű������� �ִ� ������ ����� �⺻ �����ڴ� �ڵ� ����
	//->�⺻ ������ ����� ���� �ʿ�
	
	
	//�ʵ�(field)
	private int a;
	
	//�⺻ ������
	public Test() {
		
	}
	
	//�Ű����� �ִ� ������(constructor) -> public
	public Test(int a) {
		this.a = a;
	}
	
	//getter, setter -> public
	public int getA() {
		return this.a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
}
