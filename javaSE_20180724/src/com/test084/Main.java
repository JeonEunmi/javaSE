package com.test084;

public class Main {

	public static void main(String[] args) {

		// �͸� ���� ��ü
		// -> ������� ���� Ŭ����(class) ���� �ٷ� ���� ��ü(instance) ���
		// -> �������̵� �޼ҵ� ���� �� �ѽ������� ����� �� �ۼ��Ѵ�.
		Super s2 = new Super() {

			@Override
			public void method() {
				System.out.println("�͸� ���� ��ü");
			}
			
		};
		
		s2.method();
		
		// ��ǥ���� �͸� ���� ��ü ����� ���� ���
		// -> Arrays.sort()
	}

}
