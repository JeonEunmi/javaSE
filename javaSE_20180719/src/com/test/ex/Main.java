package com.test.ex;

import java.util.*;

//메인 메뉴 운영 클래스
public class Main {

	public static void main(String[] args) {
		//메인 메뉴 구성
		//1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		System.out.println("**Bank Application**");

		while(flag){
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.print("선택 > ");

			int selectNum = 0;
			selectNum = sc.nextInt();
			sc.nextLine();

			switch(selectNum){
			case 1 : bank.createAccount(sc);
				break;
			case 2 : bank.accountList();
				break;
			case 3 : bank.deposit(sc);
				break;
			case 4 : bank.withdraw(sc);
				break;
			case 5 : flag = false;

			}
		}
		
		sc.close();
		System.out.println("프로그램종료");
	}

}
