package com.test020;

import java.util.Scanner;

//����޴� � Ŭ����
public class SubMain {
	
	//Test Ŭ������ ��ü�� �ʵ�� ����
	private Test t = new Test();
		
	//���� �޴����� ������ �޼ҵ� ����
	
	//���θ޴� '1.������ȯ' ���ý� ȣ��Ǵ� ����޴� �޼ҵ�
	public void method1 (Scanner sc) {
		// ���� �޴� ��� ���õ� �޼ҵ�

		while(true) {
			System.out.println("====================================================");
			System.out.println("1. 2���� -> 10����  2. 10���� -> 2����  3. ��������");
			System.out.println("====================================================");
			System.out.print("���� > ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 3) break;
			
			if(selectNo == 1) {
				//���� �޴��� �׼� �ڵ带 ������ �޼ҵ�� ���� �ʿ�
				this.subMethod1();
			}
			
			if(selectNo == 2) {
				//�׼� �ڵ� -> �������� Ŭ������ �������� �޼ҵ�� ǥ��
				this.subMethod2();
			}
			

		}

	}
	
	//����޴��� �׼��� private �޼ҵ�� ��ȯ
	//2.2���� -> 10����
	private void subMethod1() {
		//����)
		//10������ 2������ ��ȯ�ϴ� �޼ҵ� ȣ��
		//���࿹)
		/*
		10(10) -> 1010(2)
		15(10) -> 1111(2)
		*/ 
		System.out.printf("%s(2) -> %s(10)%n", "1010", t.toDec("1010"));
		System.out.printf("%s(2) -> %s(10)%n", "1111", t.toDec("1111"));//"1010(2) -> 10(10)"
	}
	
	//����޴��� �׼��� private �޼ҵ�� ��ȯ
		//2.10����->2����
		private void subMethod2() {
		System.out.printf("%s(10) -> %s(2)%n", "10", t.toBin("10"));
		System.out.printf("%s(10) -> %s(2)%n", "15", t.toBin("15"));
		
		}
}
