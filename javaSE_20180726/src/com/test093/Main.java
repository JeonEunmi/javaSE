package com.test093;

public class Main {

	public static void main(String[] args) {

		// Outer Class�� ��ü ����
		// -> �߻� Ŭ�����̹Ƿ� ���� ��ü ���� �Ұ�

		// Cannot instantiate the type Outer
		// Outer outer = new Outer();

		// Anonymous Inner Class
		// -> �������� ����(.java)�� ���� �ʴ´�.
		Outer outer = new Outer() {

			@Override
			public void method2() {
				System.out.println("�߻� �޼ҵ忡 ���� �������̵� ����");

			}

		};
		
		outer.method1();
		outer.method2();
	}

}
