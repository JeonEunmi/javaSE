package com.test027;

public class Main {

	public static void main(String[] args) {
		
		//Test Ŭ������ ��ü(instance) ����
		Test t = new Test();
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		//����) �������� ȸ������(�̸�, ��ȭ��ȣ, ����)�� �Ű������� ����
		//m1 -> HONG �����
		//m2 -> PARK �����
		
		
		m1.setName("HONG");
		m1.setPhone("010-1111-1111");
		m1.setAge(20);
		
		m2.setName("PARK");
		m2.setPhone("010-2222-2222");
		m2.setAge(21);
		
		m3.setName("CHOI");
		m3.setPhone("010-3333-3333");
		m3.setAge(26);
		
		t.m(m1, m2, m3);
		
	}

}
