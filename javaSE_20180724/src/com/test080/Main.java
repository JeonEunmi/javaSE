package com.test080;

public class Main {

	public static void main(String[] args) {

		Object o1 = new Object();

		o1.toString(); // public
		// o1.clone(); // protected�̱� ������ ���� �Ұ�
		
		// ���� ��ü
		Super s1 = new Super(10);
		System.out.println(s1.getA());  // 10

		// �纻��ü�� �ƴϴ�. -> ���� �޸𸮿����� �� ���� ��ü
		// �ϳ��� ��ü�� �ּҸ� ��������
		Super s2 = s1;
		System.out.println(s2.getA());  // 10
		s2.setA(20);
		System.out.println(s1.getA());  // 20
		// �纻 �����͸� �����Ͽ�����, ���� �����Ϳ��� ������ ����
		// �纻 �����Ͱ� �ƴ��� �����
		
		// �纻 ��ü -> ���� �޸𸮿����� �� ���� ��ü
		try {
			Super s3 = (Super) s1.getCopy();
			s3.setA(30);
			System.out.println(s1.getA());   // 20
			System.out.println(s3.getA());   // 30
		// �纻 �����͸� �����Ͽ�����, ���� �����ʹ� �ƹ��� ������ ���� ����
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
