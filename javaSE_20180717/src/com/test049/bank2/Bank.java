package com.test049.bank2;

import java.util.Scanner;

// 액션 클래스

// -> 자료 저장소 객체 운영만 작성한다.
public class Bank {

	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	private Account account = new Account();

	// 자료 저장소 객체 생성 -> (instance) field로만 선언
	// -> 배열 (또는 컬렉션, 데이터 베이스) 저장소
	// -> 배열 저장소는 크기고정의 단점이 있기 때문에,
	// 크기 고정의 단점 해소를 위해서 배열저장소 확장이 필요하다.
	private Account[] accountArray = new Account[10];

	// 배열 인덱스 관리용 임시 변수 -> field
	// ->배열 저장소에 저장된 Account 객체의 카운팅 역할
	private int idx;

	// 자료 저장소 초기화
	// -> 인스턴스 초기화 : 기본생성자 , static 초기화 : 초기화 블록
	// -> 가상 계좌 한 개(B0001, HONG, 10)를 저장소에 저장
	public Bank() {
		this.accountArray[this.idx] = new Account("B0001", "HONG", 10);
		++this.idx;
	}

	// 계좌생성하기
	// -> 외부에서 전달받은 자료(Account 객체)를 저장소에 저장
	public void createAccount(Account account) {

		this.accountArray[this.idx] = account;
		++this.idx;

		// 현재의 배열 저장소가 모자란 경우
		// 저장소 확장 액션 호출
		// -> private method
	}

	// 계좌목록
	public Account[] accountList() {

		// 배열 저장소에 있는 목록에서
		// null을 제외한 Account 객체만 별도의 배열로 생성 및 반환
		Account[] list = new Account[this.idx];
		for (int i = 0, j = 0; i < this.idx; i++) {
			if (this.accountArray[i] != null) {
				// (참조형 이므로)얕은 복사 -> 참조 주소만 복사
				list[j] = this.accountArray[i];
				++j;
			}
		}
		return list;
	}

	// 예금하기
	public int deposit(Account account) {

		// 1. 계좌번호 문의 -> 콘솔 액션
		// 2. 입금액 문의 -> 콘솔 액션
		// 3. Account 객체 찾기 -> private method findAcoount 호출 -> 특정 Account 객체의 참조주소 반환
		// 4. 특정 Account 객체의 balance 멤버의 금액(getter)을 + 연산 수행 -> setter 호출
		// 5. 메시지 출력 -> "결과 : 입금 성공!"

		Account a = findAccount(account.getAno());

		if (account.getBalance() < Bank.MIN_BALANCE || account.getBalance() > Bank.MAX_BALANCE) {

		} else {
			a.setBalance((account.getBalance() + a.getBalance()));
		}
		int result = a.getBalance();
		return result;

	}

	// 출금하기
	public int withdraw(Account account) {
		// 콘솔 액션 -> Scanner 객체 필요
		Account a = findAccount(account.getAno());

		if (account.getBalance() < Bank.MIN_BALANCE || account.getBalance() > Bank.MAX_BALANCE || a.getBalance() - account.getBalance() < 0) {
		} else {
			a.setBalance((a.getBalance() - account.getBalance()));
		}
		int result = a.getBalance();
		return result;

	}

	// Account 객체 찾기 -> 메인메뉴 상에 연결되지 않은 메소드 (private method)
	private Account findAccount(String ano) {

		Account result = null;

		// 반복문 액션
		// ->전달받은 ano와 일치하는 ano를 가진 특정 객체 탐색
		for (Account a : accountArray) {
			if (a != null && ano.equals(a.getAno())) {
				result = a;
			}

		}

		return result;
	}

}
