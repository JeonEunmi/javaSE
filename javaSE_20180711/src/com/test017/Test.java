package com.test017;

public class Test {
	
	// ����������
	// Ŭ����, �޼ҵ�, �ʵ� ��� ���� ����
	// -> ��ü ���� Ư¡ �� �ϳ��� ĸ��ȭ ����
	/*
	Visible to the package, the default. No modifiers are needed.
	Visible to the class only (private).
	Visible to the world (public).
	Visible to the package and all subclasses (protected)
	*/
	
	// default - ���� ��Ű�� �������� ���� ����
	void method() {
	
		// ���� Ŭ���� ������ �ٸ� (instance) �޼ҵ� ȣ��
		this.method2();
		this.method3();
		this.method4(); 
		
		//this. �� ���� ����������, ���� Ŭ������ �ٸ� �޼ҵ带 ȣ���Ѵٴ� �ǹ�
		// static���� this. �� ���� �� ����. instance�� static���� ������
		
	}
	
	// private - ���� Ŭ���� �������� ���� ����
	private void method2() {
		
		this.method2();
		this.method3();
		this.method4(); 
		
	}
	
	// public - �ٸ� ��Ű�� �������� ���� ����
	public void method3() {
		
	}
	
	// protected - ���� ��Ű�� �� + ��� ������ ��� ���� ����
	protected void method4() {
		
	}
}
