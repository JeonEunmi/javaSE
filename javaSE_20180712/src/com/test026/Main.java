package com.test026;

public class Main {

	public static void main(String[] args) {
		
		//Test Ŭ������ ��ü(instance) ����
		Test t = new Test();
		
		//�Ű������� �� ������ ���� Member ��ü ����
		//->name, age, phone ������ �ڵ� �ʱ�ȭ
		Member m = new Member();
		//����ڰ� ���ϴ� ���� �ʱ�ȭ ���� -> setter ȣ��
		m.setName("HONG");
		m.setPhone("010-1111-1111");
		m.setAge(26);
		
		//�Ű������� �� ����
		t.method(m); //�̸�, ��ȭ��ȣ, ���� ���
		
		
	}

}
