package com.test045;

public class Test {

	// �̱���(singleton)
	// -> ������ ���� (���α׷� �����) ���� �� �����μ� ��ü ������ �����ϴ� ����
	// -> �������� ��ü�� �������� ���ϵ��� ����, �� ���� ��ü������ ����ϵ��� �Ѵ�.
	
	// private ������, static ���
	
	// �ܺηκ����� ��ü ���� ���� -> private ������ 
	private Test() {
		
	}
	
	// �Ѱ��� ��ü�� �����ϵ��� �̸� ������ ��ü�� static ����� ����
	private static Test t = new Test();
	
	// �̸� ������ ��ü�� �ܺ� �����ϱ� ���� �޼ҵ�
	public static Test getInstance() {
		//�����ּ� ��ȯ
		return Test.t;
	}
}
