package com.test;

import java.util.*;

public class Sample080 {

	public static void main(String[] args) {

		// �Է�
		String[] names = {"park", "kim", "lee", "choi", "hong"};
		int[] scores = new int[5];
		
		// �ܺ� �Է� �׼�
		// java.util ��Ű���� Scanner Ŭ����
		// ���� �Է� -> nextInt() �޼ҵ� -> scores �迭�� ����
		// ������ ���� -> 0~100
		Scanner scanner = new Scanner (System.in);
		
		for(int i = 0; i < scores.length; ++i) {
			System.out.print(names[i]+"�� ������ �Է����ּ���. ������ 0~100�����Դϴ�. > ");
			int num = scanner.nextInt();
			scanner.nextLine();			
			while(num < 0 || num >100) {
				System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.print(names[i]+"�� ������ �Է����ּ���. ������ 0~100�����Դϴ�. > ");
				num = scanner.nextInt();
				scanner.nextLine();	
			}
				scores[i] = num;

		} 
		scanner.close();
		
		// ��ü ��� �� ���� ���
		System.out.println("---------------------------");
		for(int i=0; i<scores.length; ++i) {
		System.out.println(names[i]+ "�� ������ " + scores[i] + "�� �Դϴ�.");
		
		}
		System.out.println("---------------------------");
		System.out.println("�հ��� (60�� �̻�) : " );
		for(int i=0; i<names.length; ++i) {
			if(scores[i]>=60)
			System.out.println(names[i]);
		}
		System.out.println("���հ��� (60�� �̸�) : ");
		for(int i=0; i<names.length; ++i) {
			if(scores[i]<60)
			System.out.println(names[i]);

	}

}
}
