package com.employee.main;

import java.util.*;

import com.employee.service.SubMain;

// ����ȭ�� ���� Ŭ����
public class Main {

	public static void main(String[] args) {
		
		// ���� �޴� ���� �� �
		
		boolean flag = true;
		
		SubMain sub = new SubMain();
		
		Scanner sc = new Scanner(System.in);
		
			while(flag) {
				try {
			
					System.out.println("=================");
					System.out.println(" ������ ����  v1.0");
					System.out.println("=================");
					
					System.out.println("1. ���� ���� | 2. ���� ���� ����");
					System.out.print("����(1~2, 0 exit)?  ");
					
					// ���� ó�� �ڵ� �߰� ����
					int selectNum = 0;
					selectNum = sc.nextInt();
					sc.nextLine();
			
				
					switch(selectNum) {
					case 1 :
						sub.mainMenu1(sc);
						break;
					case 2 :
						sub.mainMenu2(sc);
						break;
					case 0 :
						flag = false;
					}
				}catch(Exception e) {
					sc.nextLine();
					System.out.println("�͢� �߸��� �޴� �����Դϴ�.");
				}
				
				System.out.println();
			}
			
			
			
			sc.close();
			System.out.println("���α׷� ����");
			
		}
}

