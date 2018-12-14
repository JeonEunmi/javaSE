package com.test048;

public class Test {

	// static final Ű����
	// -> �ʱ�ȭ ���� ���°� ����(setter) �Ұ��� ���� ����� ���
	// -> �б� ���� (getter)
	// -> ���� �����ڴ� public ���
	// -> �ʵ���� �빮�� ���
	// -> "���(constants)" �� ȣĪ
	// -> static �̱� ������ �ڵ�, ����� �ʱ�ȭ ����
	
	// �� ��ü(instance)���� ���������� �������� ���� �ڷ�
	private String name; // "hong" or "park"
	// �б� ���� �ڷ�
	public static final String DEPT = "�ֿ뱳������";
	
	// (instance) getter
	public String getName() {
		return this.name;
	}
		
	// (instance) setter
	// -> ��ü�� ���°� ���� �� ����Ѵ�.
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	// (static) getter
	public String getDept() {
		return this.dept;
}
	
	//(instance) setter
	public void setDept(String dept) {
		//final field -> ���� �Ұ�
		this.dept = dept;
	}
	*/
}
