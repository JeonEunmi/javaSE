package com.grade02;

import java.util.*;

// ���� �޴� � Ŭ����
public class Main {

	// main() �޼ҵ常 ����
	public static void main(String[] args) {
		// ���� �޴� ����
		// 1. ���������Է� 2. ����������� 3.���������˻� 4.����
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();
		
		System.out.println("**�������� v1.0**");
		
		while(flag) {
			
			System.out.println("======================================================");
			System.out.println("1. ���������Է� 2. ����������� 3.���������˻� 4.����");
			System.out.println("======================================================");
			System.out.print("���� >  ");
			
			int selectNum = 0;
			selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
			case 1 : sub.gradeAdd(sc);
					break;
			case 2 : sub.gradeList();
					break;
			case 3 : sub.gradeSearch(sc);
					break;
			case 4 : flag = false;
			
			}


		}
		
		sc.close();
		System.out.println("���α׷� ����");
		
	}

}
