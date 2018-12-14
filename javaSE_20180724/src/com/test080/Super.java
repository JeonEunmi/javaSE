package com.test080;

public class Super implements Cloneable{

	// Object Ŭ������ ����� ����� �� �ִ�.
	// ->toString(), equals(), clone(), ...
	
	// ���� ��ü�� ���°��� ���� �纻 ��ü ����
	// �⺻ �ڷ��� ���°� -> �� ����
	// ���� �ڷ��� ���°� -> �����ּ� ���� (���� ����)
	/*
	protected Object clone()
            throws CloneNotSupportedException
    */
	
	private int a;
	
	public Super() {
		
	}
	
	public Super(int a) {
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	// ���� ����
	public Super getCopy() throws CloneNotSupportedException {
		return (Super) this.clone(); 
	}
	
	
}
