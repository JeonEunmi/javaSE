package com.test094;

public class Outer {

	// ��ø Ŭ����(Static Inner Class)
	// Ŭ���� ���� �ȿ� �Ǵٸ� Ŭ���� ������ �ִ� ���¸� ��ø Ŭ������� �Ѵ�.
	// ����(static) ���(
	// �ʵ�
	private int a;
	
	// ������
	public Outer() {
		
	}
	
	// �޼ҵ�
	public void method() {
		
		Inner.smethod();
	}
	
	// ��ø Ŭ����(Static Nested Class)
	// -> ���� Ŭ���� �������� ����ϴ� ���� �ڷ������μ� Ŭ���� ����
	private static class Inner {
		
		public void method() {
			System.out.println("Static Nested Class�� �ν��Ͻ� �޼ҵ� ȣ��");
		}
		
		public static void smethod() {
			
		}
	}
	
	public static class Test{
		public void method() {
			System.out.println("�׽�Ʈ");
		}
	}
}
