package com.test104;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���θ޴�(1~2)>");
			int a = 0;
			try {
				a = sc.nextInt();
				sc.nextLine();
				
				if (a == 0) break;
				
				switch (a) {
				case 1:	sub.method1(sc); break;
				case 2:	sub.method2(sc);  break;
				}
				
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		
		sc.close();
		System.out.println("���α׷� ����");
	}

}
