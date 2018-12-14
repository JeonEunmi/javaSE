package com.test091;

public class Outer {

	// ��ø Ŭ����(Inner Class)
	// Ŭ���� ���� �ȿ� �Ǵٸ� Ŭ���� ������ �ִ� ���¸� ��ø Ŭ������� �Ѵ�.
	// �ν��Ͻ� ���(�ʵ�, �޼ҵ� ��)���� ��ϵ� ��ø Ŭ����
	
	// �ʵ�
	private int a;
	
	// ������
	public Outer() {
		
	}
	
	// �޼ҵ�
	public void method() {
		
		// Inner Class�� ��ü ����
		Inner inner = new Inner();
		
		// Inner Class ��ü�� �ν��Ͻ� ��� ����
		inner.method();
	}
	
	// ��ø Ŭ����(Inner Class)
	// -> ���� Ŭ���� �������� ����ϴ� ���� �ڷ������μ� Ŭ���� ����
	private class Inner {
		// ������ �ʵ�, ������, �޼ҵ� ���� ����
		// ��, ����(static) ��� ���� �Ұ�
		
		public void method() {
			System.out.println("�̳� Ŭ����");
		}
	}
	
	
	// ��ø Ŭ���� (Inner Class)
	// -> ���� �����ڰ� private�� �ƴ� ��� �ܺο��� ���� ����
	// -> �������� Ŭ������ �����ϴ� ���� ����
	public class Test{
		public void method() {
			
		}
	}
	
}
