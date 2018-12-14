package com.test.ex;

import java.util.*;
public class Bank {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	

	// 자료 저장소 객체 생성 -> (instance) field로만 선언
	// -> 배열 (또는 컬렉션, 데이터 베이스) 저장소
	// -> 배열 저장소는 크기고정의 단점이 있기 때문에,
	// 크기 고정의 단점 해소를 위해서 배열저장소 확장이 필요하다.
	private Account[] accountArray = new Account[10];

	// 배열 인덱스 관리용 임시 변수 -> field
	private int idx;

	// 자료 저장소 초기화
	// -> 인스턴스 초기화 : 기본생성자 , static 초기화 : 초기화 블록
	// -> 가상 계좌 한 개(B0001, HONG, 10)를 저장소에 저장
	public Bank() {
		this.accountArray[this.idx] = new Account("B0001", "HONG", 10);
	}

	// 계좌생성 -> 외부에서 전달되는 자료 없이 내부적인 액션만으로 계좌 객체 생성 및 저장소 저장
	public void createAccount(Scanner sc) {
		// 콘솔 액션 -> sc 객체 필요
		++this.idx;
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   생   성                 ");
		System.out.println("==================================================");
		System.out.print("계좌번호(B****): ");
		String ano = sc.nextLine();
		System.out.print("계좌주 : ");
		String owner = sc.nextLine();
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		sc.nextLine();
		
		// 현재 저장소가 부족할 경우 저장소 확장
		// private method 확장

		this.accountArray[this.idx] = new Account(ano, owner, balance);

		System.out.println("--------------------------------------------------");
		System.out.println("계좌가 생성되었습니다.");
		System.out.println();
	}

	// 계좌목록
	public void accountList() {

		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   목   록                 ");
		System.out.println("==================================================");

		// 배열 저장소에 저장된 Account 객체 목록을 출력
		// -> 배열 저장소에서 자료(Account 객체)가 저장된경우만 출력되도록 한다.
		// -> 카운팅 결과 출력
		// -> 카운팅 결과를 가지고 배열 인덱스에 사용 예정
		int count = 0;
		for (Account i : this.accountArray) {
			// toString() 메소드는 생략 가능
			if (i != null) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("총 계좌목록 : " + count + "건");
		System.out.println();

		// 카운팅 결과를 배열 인덱스 변수에 저장
		this.idx = count;
	}

	// 예금하기
	public void deposit(Scanner sc) {

		// 1. 계좌번호 문의 -> 콘솔 액션
		// 2. 입금액 문의 -> 콘솔 액션
		// 3. Account 객체 찾기 -> private method findAcoount 호출 -> 특정 Account 객체의 참조주소 반환
		// 4. 특정 Account 객체의 balance 멤버의 금액(getter)을 + 연산 수행 -> setter 호출
		// 5. 메시지 출력 -> "결과 : 입금 성공!"

		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   입   금                 ");
		System.out.println("==================================================");
		
		System.out.print("입금하실 계좌 번호를 입력해주세요. > ");
		String ano = sc.nextLine();

		System.out.print("예금액 : ");
		int money = sc.nextInt();
		sc.nextLine();

		Account a = findAccount(ano);
		
		if(money < Bank.MIN_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("잘못된 금액을 입력하셨습니다. 최소 0원 이상 입금 가능");
			System.out.println("입금 실패!");
		} else if(money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("입금 실패. 1회 예금 총액 한도는 100만원 입니다.");
		} else {
			a.setBalance((a.getBalance()) + money);	
			System.out.println("--------------------------------------------------");
			System.out.println("입금 성공!");
		}
		
		System.out.println("현재 잔액 : " + a.getBalance());
		System.out.println();

	}

	// 출금하기
	public void withdraw(Scanner sc) {
		// 콘솔 액션 -> sc 객체 필요
		
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                계   좌   출   금                 ");
		System.out.println("==================================================");
		
		System.out.print("출금하실 계좌 번호를 입력해주세요. > ");
		String ano = sc.nextLine();

		System.out.print("출금액 : ");
		int money = sc.nextInt();
		sc.nextLine();

		Account a = findAccount(ano);
		if(a.getBalance() - money < 0) {
			System.out.println("--------------------------------------------------");
			System.out.println("잔고가 부족합니다.");
		} else if(money < Bank.MIN_BALANCE){
			System.out.println("--------------------------------------------------");
			System.out.println("잘못된 금액을 입력하셨습니다. 최소 0원 이상 출금 가능");
		} else if(money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("출금 실패. 최대 100만원까지만 출금가능합니다.");
		}
		else {
		a.setBalance((a.getBalance()) - money);
		System.out.println("--------------------------------------------------");
		System.out.println("출금 성공!");
		}
		
		System.out.println("현재 잔액 : " + a.getBalance());
		System.out.println();

	}

	// Account 객체 찾기 -> 메인메뉴 상에 연결되지 않은 메소드 (private method)
	private Account findAccount(String ano) {

		Account result = null;

		// 반복문 액션
		// ->전달받은 ano와 일치하는 ano를 가진 특정 객체 탐색
		for(Account a : accountArray) {
			if (a != null && ano.equals(a.getAno())) {
				result = a;
		}
		

		}

		return result;
	}

}
