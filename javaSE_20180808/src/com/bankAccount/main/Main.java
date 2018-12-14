package com.bankAccount.main;

import java.util.Scanner;

import com.bankAccount.persistance.AccountDAO;
import com.bankAccount.service.AdminSubMain;
import com.bankAccount.service.OwnerSubMain;

// 메인 클래스
public class Main {

	/*
	 * - 계좌조회, 계좌입금, 계좌출금 기능 구현 - 계좌주 개인정보와, 계좌정보, 거래내역 등을 관리 - 계좌주 개인정보는 이름, 전화번호로
	 * 구성 - 계좌정보는 계좌번호, 현재잔액, 계좌생성일, 비밀번호, 마지막거래일로 구성 - 거래내역은 계좌번호, 입출금액, 입출금일,
	 * 입출금구분, 잔액으로 구성 - 관리자 전용 화면 구현. 사용자 화면에서 메뉴번호가 아닌 특정번호 입력시 관리자 화면으로 이동 가능. -
	 * 관리자 전용 화면에서 계좌생성, 전체계좌조회 및 입출금내역 출력 담당 - 직렬화/역직렬화 기능 구현
	 */

	// 메인 메뉴 관리
	// 1.계좌조회 2.계좌입금 3.계좌출금 4.종료
	// -> 관리자전용인 99번은 노출되지 않는다.
	public static void main(String[] args) {

		// 메인메뉴
		// 1.계좌조회 2.계좌입금 3.계좌출금 4.종료
		// -> 관리자 전용 메뉴(99)는 화면상에 노출되지 않는다.

		Scanner sc = new Scanner(System.in);
		// 주의)
		// Main 클래스 main() 메소드에서 객체 생성된 AccountDAO를
		// SubMain 객체와 AdminSubMain 객체에 전달시켜서 공유가 되도록 한다.
		AccountDAO dao = new AccountDAO();

		OwnerSubMain sub = new OwnerSubMain(dao);
		AdminSubMain adminSub = new AdminSubMain(dao);

		while (true) {
			try {
				// 메인 메뉴 구성
				System.out.println();
				System.out.println("**계좌관리 v1.0**");
				System.out.println("1.계좌조회 2.계좌입금 3.계좌출금 4.종료");
				System.out.print("선택>");

				int m = sc.nextInt();
				sc.nextLine();

				if (m == 4 || m == 0) {
					// 직렬화 진행
					sub.serializable();
					adminSub.serializable();
					break;
				}

				// switch~case 구문을 이용한 메뉴 선택
				switch (m) {
				case 1:
					sub.accountSearch(sc);
					break;
				case 2:
					sub.accountIn(sc);
					break;
				case 3:
					sub.accountOut(sc);
					break;
				case 99:
					new AdminSubMain(dao).main(sc);
					break;
				default:
					System.out.println("잘못된 메뉴 선택입니다.");
					break;
				}

			} catch (Exception e) {
				System.out.println("잘못된 액션입니다.");
				sc.nextLine();
				// e.printStackTrace();
			}

		}

		sc.close();
		
		
		System.out.println("프로그램 종료.");
		
		

	}

}
