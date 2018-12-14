package com.test023;

public class Test {
	
	//����������
	//Ŭ����, �޼ҵ�(������), �ʵ� ��� ���� ����
	//->��ü ���� Ư¡ �� �ϳ��� ĸ��ȭ(�ܺηκ����� ���� ����) ����
	/*
	Visible to the package, the default. No modifiers are needed.
	Visible to the class only (private).
	Visible to the world (public).
	Visible to the package and all subclasses (protected).
	*/
	
	//field - �ʵ�. ��ü�� ���°� ����� ����. Global. �ڵ� �ʱ�ȭ.

	//default - ���� ��Ű�� �������� ���� ���� 
	int n1;

	//public - �ٸ� ��Ű�������� ���� ����
	public double n2;
	
	//private - ���� Ŭ���� �������� ���� ����. ����.
	private String n3;
	
	public void method() {
		//(instance) field ����
		System.out.println(this.n1); //0
		System.out.println(this.n2); //0.0
		System.out.println(this.n3); //null
	}
	
	
	//private field�� ���� �ܺ� ������ �����ִ� getter, setter �޼ҵ� �߰�
	/*
	public ��ȯ�ڷ��� getXXXX() {
		return ��ȯ��;
	} 
	public void setXXXX(�ڷ��� ����) {
		this.���� = ����;
	} 
	*/
	public String getN3() {
		return this.n3;
	}
	public void setN3(String n3) {
		this.n3 = n3;
	}
	
}
