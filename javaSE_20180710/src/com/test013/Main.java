package com.test013;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// ����)
		// �ߺ����� ���� ��ȣ�� ���� �ζǹ�ȣ(6��) �޼ҵ� ȣ��
		// ����ڰ� ���ϴ� �����ŭ �ѹ��� ��µǵ��� �Ѵ�.
		/*
		���࿹)
		
		�ܺ��Է� ->  
		���ϴ� ��� (n) > 10
		
		��°��
		1. [??, ??, ??, ??, ??, ??]
		2. [??, ??, ??, ??, ??, ??]
		3. [??, ??, ??, ??, ??, ??]
		4. [??, ??, ??, ??, ??, ??]
		5. [??, ??, ??, ??, ??, ??]
		 */
		
		Test t = new Test();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ζ� ���� ��ǰǰ���? (1~10) > ");
		
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("===============================");
		
		int[] count = new int[6];
		
		for(int i = 1; i <= number; ++i) {
			count = t.lotto();
			System.out.println(Arrays.toString(count));
		}
		
		scanner.close();
		
	}

}
