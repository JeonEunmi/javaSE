package com.test086;

public class Main {

	public static void main(String[] args) {

		// Sub1 Ŭ������ ��ü ����
		Sub1 s1 = new Sub1();
		s1.method(); // ���� �޼ҵ�
		s1.sub1(); // ���� �޼ҵ�

		// Sub2 Ŭ������ ��ü ����
		Sub2 s2 = new Sub2();
		s2.method(); // ���� �޼ҵ�
		s2.sub2(); // ���� �޼ҵ�

		// ��ü ���� �� �����ּ� ���� ������ �ڷ����� �������̽��� ����
		Super s3 = new Sub1();
		s3.method(); // ���� �޼ҵ� ȣ�� �� �ٸ� ��� ���� �� �ִ�.
		// s3.sub1(); // ��� ���� ����

		// ������ (Polymorphism) - �ϳ��� �ڷ����� ���� ������ �پ��� �ڷ����� ��ü ����
		// �ڵ� Ÿ�� ��ȯ ( �Ͻ��� ����ȯ)
		// -> Sub2 ��ü�� �ڷ����� Sub2 �̾�� ������ Super �ڷ��� ������ ���� ����
		Super s4 = new Sub2();
		s4.method();
		// s4.sub2(); // ��� ���� ����

		// Sub1 �ڷ����� ���� �迭 ����
		Sub1[] sub1List = new Sub1[5];
		sub1List[0] = new Sub1();
		// sub1List[1] = new Sub2(); // Sub2 ��ü ���� �Ұ� - ���� �ڷ����� ����

		// Super �ڷ����� ���� �迭 ����
		Super[] superList = new Super[5];
		superList[0] = new Sub1(); // Sub1 ��ü ���� ����
		superList[1] = new Sub2(); // Sub2 ��ü ���� ����

		// ���� Ÿ�� ��ȯ(����� ����ȯ)
		// -> �������̽� �ڷ��� ����, ���� Ŭ���� �ڷ��� ������ �����
		// ���� ��ü�� ���� �ڷ������� ��ȯ
		superList[0].method();
		// superList[0].sub1(); // ��� ���� ����
		((Sub1) superList[0]).sub1(); // ��� ���� ����

		// instanceof ������
		// �ڷ��� �˻��ϴ� ������
		((Sub1) superList[1]).sub1(); // java.lang.ClassCastException:

		// -> �ذ�
		if (superList[1] instanceof Sub1) {
			((Sub1) superList[1]).sub1();
		}

	}

}
