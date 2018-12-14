package com.test049;

import java.util.*;

// 메인 메뉴 운영 클래스
// ->main() 메소드 멤버 외에 추가 멤버를 구성하지 않는다.
public class Main {

	public static void main(String[] args) {

		// 프로그램 작성 순서
		// 1. 화면 설계
		// 2. 자료형 클래스 설계
		// 3. 액션 클래스 설계
		// 4. 메뉴 구성
		// 5. 출력 액션 작성 및 테스트
		// 6. 입력 액션 작성 및 테스트
		// 7. 추가 액션 작성 및 테스트

		Bank bank = new Bank();

		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");

			int selectNum = scanner.nextInt();
			scanner.nextLine();

			switch (selectNum) {
			case 1:
				bank.createAccount(scanner);
				break;
			case 2:
				bank.accountList();
				break;
			case 3:
				bank.deposit(scanner);
				break;
			case 4:
				bank.withdraw(scanner);
				break;
			case 5:
				flag = false;
			}

		}

		System.out.println("프로그램 종료");
		scanner.close();
	}

}
