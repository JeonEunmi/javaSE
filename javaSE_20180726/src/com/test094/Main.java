package com.test094;

public class Main {

	public static void main(String[] arg) {

		// Outer Class�� ��ü ����
		Outer outer = new Outer();
		
		outer.method();
		
		// �ܺο��� ���� ������ ��ø Ŭ������ ��ü ����
		// ->Outer Ŭ������ ��ü ���� ���� ���� �ܵ� ��ü ���� ����
		Outer.Test test = new Outer.Test();
		test.method();
	}

}
