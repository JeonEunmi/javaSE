package com.test091;

public class Main {

	public static void main(String[] arg) {

		// Outer Class�� ��ü ����
		Outer outer = new Outer();

		// Outer Class ��ü�� �ν��Ͻ� ��� ����
		// -> Inner Class�� ��ü ���� ���� �� �ν��Ͻ� ��� ���� ����
		outer.method();

		// Inner Class�� ��ü ����
		// Inner inner = new Inner(); // private
		// Inner Class ��ü�� �ν��Ͻ� ��� ����
		// inner.method();
		
		// �ܺο��� ���� ������ ��ø Ŭ������ ��ü �����ÿ��� ���
		Outer outer2 = new Outer();
		Outer.Test test = outer2.new Test();
		// �� �ٷε� ǥ�� �����ϴ�.
		Outer.Test test2 = new Outer().new Test();
		
		test.method();
	}

}
