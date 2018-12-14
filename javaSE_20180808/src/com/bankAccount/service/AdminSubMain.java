package com.bankAccount.service;

import java.util.List;
import java.util.Scanner;

import com.bankAccount.domain.Account;
import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.domain.AccountOwner;
import com.bankAccount.persistance.AccountDAO;

// 관리자용 서브 메인
public class AdminSubMain {

	// 주의)
	// 여기서 new AccountDAO() 하지 않는다.
	// Main 클래스 main() 메소드에서 객체 생성된 AccountDAO를 전달 받아서 공유해야 한다.
	// 기본 생성자 삭제
	
	private AccountDAO dao;
	
	public AdminSubMain(AccountDAO dao) {
		this.dao = dao;
		//역직렬화 진행
		this.dao.reSerializable();
	}

	// 관리자 비밀번호 운영을 위한 전용 변수
	private static String pw = "9090";

	public static String getPw() {
		return pw;
	}

	public static void setPw(String pw) {
		AdminSubMain.pw = pw;
	}

	// 1.계좌생성 2.계좌조회 3.계좌입출금내역 4.비밀번호 변경 0.종료
	public void main(Scanner sc) {
		// 비밀번호 확인 과정 추가
		System.out.println("관리자 전용 화면으로 이동합니다.");
		System.out.print("관리자비밀번호>");
		String pw = sc.nextLine();
		if (pw.equals(AdminSubMain.getPw())) {
			this.adminSub(sc);
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

	public void adminSub(Scanner sc) {

		while (true) {
			try {
				System.out.println();
				System.out.println("**계좌관리 v1.0_관리자**");
				System.out.println("1.계좌생성 2.계좌조회 3.계좌입출금내역 4.비밀번호변경 5.종료");
				System.out.print("선택> ");

				int selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 5 || selectNum == 0) {
					System.out.println("일반 사용자 화면으로 이동합니다.");
					break;
				}

				switch (selectNum) {

				case 1:
					this.accountAdd(sc);
					break;
				case 2:
					this.accountSearch(sc);
					break;
				case 3:
					this.accountIO(sc);
					break;
				case 4:
					this.pwRevise(sc);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 액션입니다.");
				sc.nextLine();
				// e.printStackTrace();
			}

		}

	}

	// 1.계좌생성
	private void accountAdd(Scanner sc) {
		System.out.println();
		System.out.println("계좌생성 작업을 위해 계좌조회를 먼저 진행합니다.");
		System.out.print("이름> ");
		String name = sc.nextLine();
		System.out.print("전화번호> ");
		String phone = sc.nextLine();

		System.out.println();
		System.out.printf("(%s/%s)님의 계좌목록%n", name, phone);
		System.out.println("============================================");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 계좌주 / 전화번호");
		
		List<AccountList> list = this.dao.accountPersonalSearch(name, phone);
		
		System.out.println("============================================");

		if (list.isEmpty()) {
			System.out.println("출력 대상이 없습니다.");
		} else {
			for (AccountList al : list) {
				System.out.println(al);
			}
		}
		System.out.printf("총 %d건%n", list.size());

		System.out.println();

		System.out.print("신규 계좌를 등록할까요? (Y/N)> ");

		String accountId = "";
		String pw = "";
		int balance = 0;

		AccountOwner ao = this.dao.personalSearch(name, phone);

		String accountOwnerId = "";

		if (ao == null) {
			accountOwnerId = this.dao.newAccountOwnerId();
			this.dao.newOwnerAdd(accountOwnerId, name, phone);
		} else {
			accountOwnerId = ao.getAccountOwnerId();
		}

		String select = sc.nextLine();

		if (select.equalsIgnoreCase("y")) {

			System.out.print("계좌번호 > ");
			accountId = sc.nextLine();

			System.out.print("비밀번호 > ");
			pw = sc.nextLine();

			System.out.print("초기입금액 > ");
			balance = sc.nextInt();

			this.dao.newAccountAdd(accountId, pw, balance, accountOwnerId);

			System.out.println("*");
			System.out.println("계좌 생성이 완료되었습니다.");
		} else {
			System.out.println("계좌 생성 취소");
		}
		System.out.println();

	}

	// 2.계좌조회
	private void accountSearch(Scanner sc) {

		while (true) {

			try {
				System.out.println();
				System.out.println("**계좌관리 v1.0_관리자** > 2.계좌조회");
				System.out.println("1.전체계좌 2.계좌번호 3.계좌주 4.종료");
				System.out.print("선택> ");

				int selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 4 || selectNum == 0) {
					break;
				}

				switch (selectNum) {

				case 1:
					this.accountSearch_sub1();
					break;
				case 2:
					this.accountSearch_sub2(sc);
					break;
				case 3:
					this.accountSearch_sub3(sc);
					break;
				case 4:
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 액션입니다.");
				sc.nextLine();
				// e.printStackTrace();
			}
		}

	}

	private void accountSearch_sub1() {
		System.out.println();

		System.out.println("전체계좌 목록");
		System.out.println("===========================================================================");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");

		List<AccountList> list = this.dao.accountAllSearch();

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.printf("총 %d 건%n", list.size());

		System.out.println();
	}

	private void accountSearch_sub2(Scanner sc) {

		System.out.println();

		System.out.print("계좌번호 > ");
		String accountId = sc.nextLine();
		System.out.println();
		System.out.printf("(%s)님의 계좌 목록%n", accountId);
		System.out.println("===========================================================================");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");

		List<AccountList> list = this.dao.accountIDSearch(accountId);

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================================================");
		System.out.printf("총 %d 건%n", list.size());

		System.out.println();
	}

	private void accountSearch_sub3(Scanner sc) {
		System.out.println();

		System.out.print("계좌주 > ");
		String accountName = sc.nextLine();

		System.out.print("전화번호 > ");
		String accountphone = sc.nextLine();
		System.out.println();
		System.out.printf("(%s/ %s)님의 계좌 목록%n", accountName, accountphone);
		System.out.println("===========================================================================");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");

		List<AccountList> list = this.dao.accountPersonalSearch(accountName, accountphone);

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================================================");
		System.out.printf("총 %d 건%n", list.size());

		System.out.println();
	}

	// 3.계좌입출금내역
	private void accountIO(Scanner sc) {
		System.out.println();

		System.out.print("계좌번호 > ");
		String accountId = sc.nextLine();

		System.out.print("내역출력시작일(yyyymmdd) > ");
		String iODate = sc.nextLine();

		System.out.println();
		System.out.printf("(%s)님의 계좌 목록%n", accountId);
		System.out.println("===========================================");
		System.out.println("계좌번호 / 금액 / 입출금일 / 구분 / 잔액");

		List<AccountHistory> list = this.dao.accountIOPrint(accountId, iODate);

		for (AccountHistory result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================");
		System.out.printf("총 %d 건%n", list.size());

		System.out.println();
	}

	// 4. 비밀번호 변경
	private void pwRevise(Scanner sc) {
		System.out.println();

		System.out.println("*비밀번호를 변경합니다*");

		System.out.print("계좌번호 > ");
		String accountId = sc.nextLine();

		System.out.print("변경할 비밀번호 > ");

		String pw = sc.nextLine();

		Account a = this.dao.accountId(accountId);

		a.setPw(pw);

		System.out.println("비밀번호 변경을 완료하였습니다.");
		System.out.println();
	}
	
	
	public void serializable() {
		
		this.dao.serializable();
		
	}
	
	public void reSerializable() {
		this.dao.reSerializable();
	}

}
