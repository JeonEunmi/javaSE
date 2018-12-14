package com.test049.bank2;

import java.util.Scanner;

// 액션 클래스
// -> 메인 메뉴별 액션 메소드 구성
public class SubMain {
	
	// Bank 클래스의 객체(instance) 생성
	// ->field
	private Bank bank = new Bank();
	
	// 계좌 생성하기
	// -> 내부적인 액션만으로 계좌 객체 생성
	public void createAccount(Scanner scanner) {
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   생   성                 ");
		System.out.println("==================================================");
		System.out.print("계좌번호(B****): ");
		String ano = scanner.nextLine();
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		System.out.print("초기 입금액 : ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		// 저장소에 자료 저장하는 액션 필요 -> Bank 객체의 특정 메소드 호출로 대체
		this.bank.createAccount(new Account(ano, owner, balance));
		
		this.bank.createAccount(new Account());
		
		System.out.println("--------------------------------------------------");
		System.out.println("계좌가 생성되었습니다.");
		System.out.println();
	}
	
	// 계좌 목록보기
	public void accountList() {
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   목   록                 ");
		System.out.println("==================================================");

		// 배열 저장소에 저장된 Account 객체 목록을 전달 받아서 출력
		// -> 카운팅 결과 출력
		Account[] list = this.bank.accountList();
		int count = list.length;
		for (Account i : list) {
			// toString() 메소드는 생략 가능
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("총 계좌목록 : " + count + "건");
	}
	
	// 예금하기
	public void deposit(Scanner scanner) {

		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   입   금                 ");
		System.out.println("==================================================");

		System.out.print("입금하실 계좌 번호를 입력해주세요. > ");
		String ano = scanner.nextLine();

		System.out.print("예금액 : ");
		int money = scanner.nextInt();
		scanner.nextLine();
		
		
		if(money < Bank.MIN_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("잘못된 금액을 입력하셨습니다. 최소 0원 이상 입금 가능");
		} else if (money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("입금 실패. 1회 예금 총액 한도는 100만원 입니다.");
		} else {
			System.out.println("--------------------------------------------------");
			System.out.println("입금 성공!");
		}
		
		System.out.println("현재 잔액 : " + this.bank.deposit(new Account(ano, null, money)));
		System.out.println();
	}
	
	// 출금하기
	public void withdraw(Scanner scanner) {
		
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   출   금                 ");
		System.out.println("==================================================");

		System.out.print("출금하실 계좌 번호를 입력해주세요. > ");
		String ano = scanner.nextLine();

		System.out.print("출금액 : ");
		int money = scanner.nextInt();
		scanner.nextLine();
		
		int temp = this.bank.withdraw(new Account(ano, null, money));
		
		if (temp - money < 0) {
			System.out.println("--------------------------------------------------");
			System.out.println("잔고가 부족합니다.");
		} else if(money < Bank.MIN_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("잘못된 금액을 입력하셨습니다. 최소 0원 이상 출금 가능");
		} else if (money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("출금 실패. 1회 출금 총액 한도는 100만원 입니다.");
		} else {
			System.out.println("--------------------------------------------------");
			System.out.println("출금 성공!");
		}
		
		System.out.println("현재 잔액 : " + temp);
		System.out.println();
	}
	
}
