package com.test;

import java.util.*;

public class Sample060 {

	public static void main(String[] args) {
		
		// 외부(키보드) 입력을 이용한 은행 업무 어플리케이션 작성
		// 1. 예금   2. 출금   3. 잔고   4. 종료
		
		boolean run = true;
		
		// 예금액 운영을 위한 임시 변수
		int bank = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int m = scanner.nextInt();
			scanner.nextLine();
			if (m == 1) {
				System.out.print("예금액> ");
				int m2 = scanner.nextInt();
				scanner.nextLine();
				bank += m2;		
			} 
			
			if (m == 2) {
				System.out.print("출금액> ");
				int m2 = scanner.nextInt();
				scanner.nextLine();
				bank -= m2;
			}
			
			if (m == 3) {
				System.out.println("잔고> " + bank);
			}
			
			if (m == 4) {
				break;
			}

		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
}


