package com.test025;

public class Main {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		//��ȯ�ڷ����� void�� ��� ��¹�, ���Թ� ��� �Ұ�
		t.setA(10);
		
		//��ȯ�ڷ����� void�� �ƴ� ��� ��¹�, ���Թ� ��� ����
		System.out.println(t.getA());
		
		t.method1();
		t.method2(10);
		t.method3("TEST");
		
		//�Ű����� �ڷ���(String)�� �ٸ� �ڷ���(int)�� ���� �� ���� -> ����Ұ�
		t.method3(Integer.toString(10));
		//t.method2(Integer.parseInt("T"));
		//t.method3(String.valueOf(10));
		
		//�Ű����� ��ϰ� ��ġ�ϴ� ��(����, �ڷ���, ����)�� ������ �Ѵ�.
		//t.method4(10);
		t.method4(10, 20);
		//t.method4(10, 20, 30);
		
		//���� �Ű����� ����(�ڷ����� ����, ������ ��������)
		t.method5(10);
		t.method5(10, 20);
		t.method5(10, 20, 30);
		
	}
}
