package com.test023;

public class Main {

	public static void main(String[] args) {
		// Test Ŭ������ n1, n2, n3(instance) field ����
		// ->Test  Ŭ������ ��ü(insatance) ���� �ʿ�
		Test t = new Test();
		 
		// �ʵ尪 �б�
		System.out.println(t.n1); // 0
		System.out.println(t.n2); // 0.0
//		System.out.println(t.n3); // private
		
		// �ʵ尪 ����
		// -> ��ü�� ���°��� �ܺο��� ���� �����ϴ� ���� �������� �ʴ´�.
		// ĸ��ȭ (Data hiding) ����                                                                                                                
		t.n1 = 10;
		System.out.println(t.n1); //10
		
		//private n3 ������ ���� getter, setter ����
		t.setN3("TEST");
		System.out.println(t.getN3());  //TEST
		
	}

}
