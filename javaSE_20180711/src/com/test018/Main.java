package com.test018;

import com.test017.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// �ٸ� ��Ű��, �ٸ� Ŭ�������� (instance) �޼ҵ� ȣ��
		// -> import ���� �ʿ�
		// ->��ü(instance) ���� �ʿ�
		
		Test t = new Test();
		
		//t.method();   // ���� ��Ű�� �ȿ����� ���δ�.
		//t.method2();  // ���� Ŭ���� �ȿ����� ���δ�.
		//t.method3(); 
		//t.method4();  // ���� ��Ű�� + ��� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����(n)> ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(a);
		
		sc.close();
	}
}
