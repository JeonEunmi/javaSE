package com.test104;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("메인메뉴(1~2)>");
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
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
