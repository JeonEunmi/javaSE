package com.test037;

public class Test {

	// this Ű����
	// -> ��ü(instance) ������ ���� ��ü�� �����ּҰ� ����� ����
	// -> ���� ��ü�� ����(instance) ���(field, method, constructor) ���ٽ� ���
	// -> instance method ���� �������� ��� ���� (static �ȿ��� ��� �Ұ���)
	
	//�ʵ�(field)
	private static int a;
	
	//�⺻������
	public Test() {
		//�Ű����� �ִ� ������ ȣ�� , ����� �ʱ�ȭ
		//�ʼ����� �ƴ�����, �����ڰ� ������ �����Ǿ��� �� ����Ѵ�.
		this(10);
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
	
	public void method() {
		System.out.println(this.getA());
	}
}
