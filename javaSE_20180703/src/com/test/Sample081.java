package com.test;

import java.util.*;

public class Sample081 {

	public static void main(String[] args) {
		
		// �ܺ�(Ű����) �Է��� �̿��� ���� ó�� ���ø����̼� �ۼ�
		// 1.�л���  2.�����Է�  3.��������Ʈ  4.�м�  5.����
		// ���� ���� ������ �ݺ� ����
		 
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;
		boolean flag = false;
		String[] names = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				scanner.nextLine();				
				scores = new int [studentNum];
			} else if(selectNo == 2) {
				if(studentNum == 0) {
					System.out.println("�л����� �Է����ּ���.");
					continue;
					}
				
				names = new String[studentNum];
				for(int i=0; i<scores.length; ++i) {
					System.out.print("�̸� ���� > ");
					String name = scanner.next();
					int tmp = scanner.nextInt();
					scanner.nextLine();
					names[i] = name;
					scores[i] = tmp;
					
					while(scores[i] < 0 || scores[i] >100) {
						System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���. (������ 0~100)");
						System.out.print("�̸� ���� > ");
						name = scanner.next();
						tmp = scanner.nextInt();
						scanner.nextLine();
						
						names[i] = name;
						scores[i] = tmp;
					}
					flag = true;
				}
				System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
	
				
			} else if(selectNo == 3) {
				if(studentNum == 0) {
					System.out.println("�л����� �Է����ּ���.");
					continue;
					}
				if(flag == false) {
					System.out.println("������ �Է����ּ���.");
					continue;
				} else if(flag == true){
					for(int i=0; i<scores.length; ++i) {
						System.out.println(names[i] + "�� ���� > " + scores[i]);
							}
				}
				
			} else if(selectNo == 4) {
				if(studentNum == 0) {
					System.out.println("�л����� �Է����ּ���.");
					continue;
					}
				if(flag == false) {
					System.out.println("������ �Է����ּ���.");
					continue;
				}
				int max = 0;
				int sum = 0;
				double avr = 0.0;
				
				for(int i=0; i<scores.length; ++i) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avr = (double)sum / scores.length;
				
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avr);
				

				int[] rank = new int[studentNum];
				
				for(int i =0; i<rank.length; ++i) {
					rank[i] = 1;
				}
				
				for(int i=0; i<rank.length; ++i) {
					for(int j=0; j<rank.length; ++j) {
						if(scores[i] < scores[j]) {
							rank[i]++;
						}
					}
				}
				System.out.println();
				System.out.println("��ü ���");
				for(int i=0; i<studentNum; ++i) {
					System.out.println(names[i] + " : "+ rank[i] + "��");
				}
				
				
			} else if(selectNo == 5) {
				run = false;
			}
			if(0 >= selectNo || selectNo >= 6 ) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); 
			continue;
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");
	}

}
