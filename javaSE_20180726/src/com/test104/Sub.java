package com.test104;

import java.util.Scanner;

public class Sub {
	
	public void method1(Scanner sc) {
		while(true) {
			System.out.print("����޴�(1~2)>");
			int a = sc.nextInt();
			sc.nextLine();
			if (a == 0) break;
			switch (a) {
			case 1: System.out.println("����޴�1 ����"); break;
			case 2: System.out.println("����޴�2 ����"); break;
			}
		}
	}

	public void method2(Scanner sc) {
		while(true) {
			System.out.print("����޴�(3~4)>");
			int a = sc.nextInt();
			sc.nextLine();
			if (a == 0) break;
			switch (a) {
			case 3: System.out.println("����޴�3 ����"); break;
			case 4: System.out.println("����޴�4 ����"); break;
			}
		}
	}

}
