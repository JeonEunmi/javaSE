package com.test047;

public class Test {

	// final Ű����
	// -> �ʱ�ȭ ���� ���°� ����(setter) �Ұ��� ���� ����� ���
	// -> �б� ���� (getter)
	// -> instance �̱� ������ �ڵ�, �����, ������ �ʱ�ȭ ����
	
	// �� ��ü(instance)���� ���������� �������� ���� �ڷ�
	private String name; // "hong" or "park"
	// �б� ���� �ڷ�
	private final String dept = "�ֿ뱳������";
	
	// (instance) getter
	public String getName() {
		return this.name;
	}
		
	// (instance) setter
	// -> ��ü�� ���°� ���� �� ����Ѵ�.
	public void setName(String name) {
		this.name = name;
	}
	
	// (static) getter
	public String getDept() {
		return this.dept;
}
	/*
	//(instance) setter
	public void setDept(String dept) {
		//final field -> ���� �Ұ�
		this.dept = dept;
	}
	*/
}
