package com.test014;

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
		
		�߰�)) �ߺ��Ǵ� ��ȣ�� ������ �ʵ��� ó��
		 */
		
		Test t = new Test();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ζ� ���� ��ǰǰ���? (1~10) > ");
		
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("===============================");
		
		// �ζ� ���� 6���� ������ ������ �ӽ� �����
		int[][] count = new int[number][];
		int[] tmp = new int [6];
		
	
		for(int i = 0; i < number; ) {
			boolean flag = true;
			tmp = t.lotto();

			for(int j =0; j < i; ++j) {
				if(Arrays.equals(tmp, count[j])){
					flag = false;
				}
			}
			
			// �ߺ� �˻� ����� ��츸 ���
			if(flag) {
				count[i] = tmp;
				System.out.println(i+1 + ". " + Arrays.toString(count[i]));
				++i;
			}

		}
		
		scanner.close();
		
	}

}
