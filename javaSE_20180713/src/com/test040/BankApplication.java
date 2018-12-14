package com.test040;

import java.util.Scanner;

public class BankApplication {

	private Account account = new Account();

	// 자료 저장소 객체 생성 -> (instance) field로만 선언
	// -> 배열 (또는 컬렉션, 데이터 베이스) 저장소
	// -> 배열 저장소는 크기고정의 단점이 있기 때문에,
	// 크기 고정의 단점 해소를 위해서 배열저장소 확장이 필요하다.
	private Account[] accountArray = new Account[10];

	// 자료 저장소 초기화
	// -> 생성자
	// -> 가상 계좌 한 개를 저장소에 저장

	// 계좌생성 -> 외부에서 전달되는 자료 없이 내부적인 액션만으로 계좌 객체 생성 및 저장소 저장
	public void createAccount(Scanner scanner) {
		// 콘솔 액션 -> Scanner 객체 필요
	}

	// 계좌목록
	public void accountList() {

	}

	// 예금하기
	public void deposit(Scanner scanner) {
		// 콘솔 액션 -> Scanner 객체 필요
	}

	// 출금하기
	public void withdraw(Scanner scanner) {
		// 콘솔 액션 -> Scanner 객체 필요
	}

	// Account 객체 찾기 -> 메인메뉴 상에 연결되지 않은 메소드 (private method)
	private Account findAccount(String ano) {
		return null;
	}
}
