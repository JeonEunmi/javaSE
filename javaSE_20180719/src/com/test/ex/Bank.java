package com.test.ex;

import java.util.Scanner;

//액션 클래스
//->자료 저장소 객체 운영 + 메인 메뉴별 액션 코드 작성.
public class Bank {
	
	//상수(static final) 추가
	public static final int MAX_BALANCE = 1000000;
	public static final int MIN_BALANCE = 0;
	
	//자료 저장소 객체 생성
	private Account[] accountArray = new Account[10];

	//배열 인덱스 관리용 임시 변수
	private int idx;
	
	//생성자 -> 자료 저장소 초기화
	public Bank(){
		this.accountArray[this.idx] = new Account("B0001", "HONG", 30000);
		++this.idx;
	}	
	//계좌생성하기 
	public void createAccount(Scanner sc){

		System.out.println("=============");
		System.out.println("계좌생성");
		System.out.println("=============");

		System.out.println("계좌번호 : ");
		String ano = sc.nextLine();

		System.out.println("계좌주 : ");
		String owner = sc.nextLine();

		System.out.println("초기입금액 : ");
		int balance = sc.nextInt();
		sc.nextLine();

		this.accountArray[this.idx] = new Account(ano, owner, balance);
		++this.idx;

		System.out.println("결과 : 계좌가 생성되었습니다.");

	}


	//계좌목록보기
	public void accountList(){

		System.out.println("=============");
		System.out.println("계좌목록");
		System.out.println("=============");

		int count = 0;
		for(Account a : accountArray){
			if(a != null) {
				System.out.println(a.toString());
				++count;
			}
		}
		System.out.println("=============");
		System.out.println("총 " + count + "건");

		}

	//예금하기
	public void deposit(Scanner sc){
		System.out.println("=============");
		System.out.println("입금");
		System.out.println("=============");

		System.out.println("계좌번호 : ");
		String ano = sc.nextLine();

		System.out.println("입금액 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		Account tmp = this.findAccount(ano);

		if( money < Bank.MIN_BALANCE){
			System.out.println("최소 0원 입금 요망");
		} else if( money > Bank.MAX_BALANCE){
			System.out.println("최대 100만원까지 입금 가능");
		} else {
			tmp.setBalance(tmp.getBalance() + money);
			System.out.println("입금 성공");
		}

		System.out.println("현재 잔액 : " + tmp.getBalance());
	}
	//출금하기
	public void withdraw(Scanner sc){
		System.out.println("=============");
		System.out.println("출금");
		System.out.println("=============");

		System.out.println("계좌번호 : ");
		String ano = sc.nextLine();

		System.out.println("출금액 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		Account tmp = this.findAccount(ano);

		if( money < Bank.MIN_BALANCE){
			System.out.println("최소 0원 출금 요망");
		} else if( money > Bank.MAX_BALANCE){
			System.out.println("최대 100만원까지 출금 가능");
		} else if ( tmp.getBalance() - money < 0){
			System.out.println("잔액 부족");
		} else {
			tmp.setBalance(tmp.getBalance() - money);
			System.out.println("출금 성공");
		}

		System.out.println("현재 잔액 : " + tmp.getBalance());
	}

	//Account 객체 찾기 -> private method
	private Account findAccount(String ano){
	
		Account result = null;

		for(Account i : accountArray){
			if( i != null && i.getAno().equals(ano)) {
				result = i;
			}
		}

		return result;
	}

}
