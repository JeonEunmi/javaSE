package com.member03.ver3;

import java.util.*;

// ���θ޴� � Ŭ���� ����
public class Main {
	
	// main() �޼ҵ常 ����
	public static void main(String[] args) {
		// ȸ������ v1.3
		
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();
		
		boolean flag = true;
		
		System.out.println("**ȸ������ �ý��� (���� 1.1)**");
		
		//���� �޴� ����
		while(flag) {
			System.out.println("1. ȸ�������Է� | 2.ȸ����ȣ��� | 3.ȸ�������˻� | 4. ����");
			System.out.print("���� > ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
				
			case 1 :
				sub.join(sc);
				break;
			
			case 2 :
				sub.memberOutput();
				break;
			
			case 3 :
				sub.memberSearch(sc);
				break;
				
			case 4 :
				flag = false;
				break;
				
			default : 
				break;
			}
			
		}

		
		sc.close();
		System.out.println("���α׷� ����");
	}

}
