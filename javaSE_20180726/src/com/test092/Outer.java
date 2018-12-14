package com.test092;

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
		
		// ��ø Ŭ����(Inner Class)
		// -> ���� Ŭ���� �������� ����ϴ� ���� �ڷ������μ� Ŭ���� ����
		// -> ���� ������ ��� �Ұ�
		class Inner {
			// ������ �ʵ�, ������, �޼ҵ� ���� ����
			// ��, ����(static) ��� ���� �Ұ�
			
			public void method() {
				System.out.println("Method-local Inner Class�� �ν��Ͻ� �޼ҵ�");
			}
		}
	
		// Inner Class�� ��ü ���� �� �ν��Ͻ� ��� ����
		new Inner().method();
	}
	

	
}
