package com.test025;

public class Test {

	//�޼ҵ�
	
	
	//�޼ҵ� ���� ����
	/*
	���������� ��ȯ�ڷ��� �޼ҵ��̸�(�Ű�����){
		�����ڵ�
		return��ȯ��;
		}
	*/
	
	//�Ű����� - �޼ҵ� ����� �ܺηκ��� ���޹޴� �ڷḦ ����. �������δ� ���� ����
	
	private int a;
	
	//setter
	public void setA (int a) {
		this.a = a;
	}
	
	//getter
	public int getA () {
		return this.a;
	}
	
	//�Ű������� ���� ���
	public void method1() {
		System.out.println("Hello, world!");
	}
	
	//�⺻ �ڷ��� �Ű�����
	public void method2(int a) {
		System.out.println(this.a);
		System.out.println(a);
	}
	
	//���� �ڷ��� �Ű�����
	public void method3(String a) {
		System.out.println(this.a);
		System.out.println(a);
		
	}
	//�Ű������� ������ �ִ� ��� - ���� ����
	public void method4(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	//�Ű������� ������ �ִ� ��� - ���� ���� (���� �Ű�����)
	public void method5(int ... args) {
		for(int a = 0; a < args.length; ++a) {
			System.out.println(args[a]);
		}
		
	}
	
}
