package com.test104;

import java.util.Scanner;

public class Sub {
	
	public void method1(Scanner sc) {
		while(true) {
			System.out.print("서브메뉴(1~2)>");
			int a = sc.nextInt();
			sc.nextLine();
			if (a == 0) break;
			switch (a) {
			case 1: System.out.println("서브메뉴1 실행"); break;
			case 2: System.out.println("서브메뉴2 실행"); break;
			}
		}
	}

	public void method2(Scanner sc) {
		while(true) {
			System.out.print("서브메뉴(3~4)>");
			int a = sc.nextInt();
			sc.nextLine();
			if (a == 0) break;
			switch (a) {
			case 3: System.out.println("서브메뉴3 실행"); break;
			case 4: System.out.println("서브메뉴4 실행"); break;
			}
		}
	}

}
