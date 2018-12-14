package com.test042;

public class Test {

	// static Ű����
	// -> ���� ���(field, method) ������ ����ϴ� Ű����
	// ���� ���,
	// private static int a = 0;
	// public static void method() { //�����ڵ�}

	// ->���� ����� ���α׷� ����� �ν��Ͻ� ���� ���� �ε��� �����̴�.
	// ���߿� �ν��Ͻ� ����� �޸𸮿� ����Ǹ� ���� ����� �̹� �ε��� ���·� ���δ�.
	// �������� ���� ������ �����̴�.
	// ->��� �ν��Ͻ� ����� ���� ����� �����ϰ� �ȴ�.
	// ���� ���, �ν��Ͻ��� name ������ ������ �ν��Ͻ��� ���� ������ ������.
	// �ݸ� ��������� dept ������ "�ֿ뱳������"�� �����ȴ�.
	// -> ���� ����� �����ڰ� ����. getter, setter�� ��� ����
	// -> �ν��Ͻ� ����� ������, getter, setter ��� ��� ����

	private String name; // "ȫ�浿", "���ڹ�", ... �� ���� ����
	private static String dept = "�ֿ뱳������"; // ���� ����� �������

	// �⺻ ������
	public Test() {

	}

	// �Ű����� �ִ� ������ (�ν��Ͻ� �޼ҵ�)
	// ->��ü �����ÿ� �� ���� ȣ�� ����
	public Test(String name) {
		// this Ű����� �ν��Ͻ� �޼ҵ� �������� ��� ����
		this.name = name;
	}
	
	// (instance) getter
	// -> ����ϴ� ���(field)�� instance�̴�.
	public String getName() {
		return this.name;
	}
	
	// (instance) setter
	// -> ��ü�� ���°� ���� �� ����Ѵ�.
	public void setName(String name) {
		this.name = name;
	}
	
	// (static) getter
	public static String getDept() {
		// ���� ��� ���� �� Ŭ������.����� ���·� �ۼ�
		// Test. �� ��������������, ���� ������ �浹 ���ɼ��� �־� �������� �ʴ´�.
		return Test.dept;
	}
	/* ���� setter�� ���� ���� ������, static�� ���� �Ұ��ϹǷ� �б��������� getter�� ����
	// (static) setter
	public static void setDept(String dept) {
		Test.dept = dept;
	}
	*/
}
