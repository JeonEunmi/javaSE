package com.test105;

public class Main {

	//main() �޼ҵ�� throws ���� ����� �������� �ʴ´�.
	//->try~catch ���� ���
	public static void main(String[] args) {
		
		//Sub Ŭ������ ��ü ����
		Sub sub = new Sub();
		
		//�޼ҵ� ������ ���� �߻� ���ɼ� ����
		//->try~catch ���� ����ϴ� �޼ҵ�
		sub.method1();
		
		//�޼ҵ� ������ ���� �߻� ���ɼ� ����
		//->throws ���� ����ϴ� �޼ҵ�
		try {
			sub.method2();
		}catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error101: �߸��� �׼��Դϴ�.");
		}
		
		System.out.println("���α׷� ����.");

	}

}
