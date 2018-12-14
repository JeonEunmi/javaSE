package com.bankAccount.persistance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import com.bankAccount.domain.Account;
import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.domain.AccountOwner;

// 자료 저장소 운영 클래스
public class AccountDAO {

	// List 컬렉션 저장소
	List<Account> account = new ArrayList<Account>();
	List<AccountHistory> accountHistory = new ArrayList<AccountHistory>();
	List<AccountOwner> accountOwner = new ArrayList<AccountOwner>();

	public AccountDAO() {
		// 초기 샘플 데이터 준비
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 비밀번호 / 계좌주 고유 번호
		// 2018030101 / 200000 / 20171010 / 20180101 / 1234 / A0001
		this.account.add(new Account("2018030101", "A0001", 200000, "20171010", "1234", "20180101"));

		// 계좌주 고유 번호 / 계좌주 / 전화번호
		// A0001 / 박길동 / 010-5678-1234
		this.accountOwner.add(new AccountOwner("A0001", "박길동", "010-5678-1234"));

		// 계좌번호 / 금액 / 입출금일 / 구분 / 잔액
		// 2018030101 / 100000 / 20171010 / 입금 / 100000
		// 2018030101 / 100000 / 20180101 / 입금 / 200000
		this.accountHistory.add(new AccountHistory("2018030101", 100000, "20171010", "입금", 100000));
		this.accountHistory.add(new AccountHistory("2018030101", 100000, "20180101", "입금", 200000));

	}

	// 계좌조회 메소드 추가
	// 계좌번호 기준
	public List<AccountList> accountIDSearch(String value) {

		List<AccountList> list = new ArrayList<AccountList>();
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
		for (Account a : this.account) {
			AccountOwner owner = this.personalIDSearch(a.getAccountOwnerId());
			if (a.getAccountId().equals(value)) {
				list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(),
						a.getLastUpdateDate(), owner.getName(), owner.getPhone()));
			}
		}
		return list;
	}

	// 계좌조회 메소드 추가
	// 계좌주 이름 / 전화번호 기준
	public List<AccountList> accountPersonalSearch(String name, String phone) {

		List<AccountList> list = new ArrayList<AccountList>();
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
		for (Account a : this.account) {
			AccountOwner owner = this.personalIDSearch(a.getAccountOwnerId());
			if (owner != null && owner.getName().equals(name) && owner.getPhone().equals(phone)) {
				list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(),
						a.getLastUpdateDate(), owner.getName(), owner.getPhone()));
			}
		}
		return list;
	}

	// 계좌조회 메소드 추가
	// 전체
	public List<AccountList> accountAllSearch() {

		List<AccountList> list = new ArrayList<AccountList>();
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호

		for (Account a : this.account) {
			list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(), a.getLastUpdateDate(),
					this.personalIDSearch(a.getAccountOwnerId()).getName(),
					this.personalIDSearch(a.getAccountOwnerId()).getPhone()));
		}
		return list;
	}

	// 계좌주 정보 조회 메소드 추가
	// -> 계좌주 고유 번호 기준
	public AccountOwner personalIDSearch(String value) {

		AccountOwner tmp = null;

		for (AccountOwner a : accountOwner) {

			if (a.getAccountOwnerId().equals(value)) {
				tmp = a;
			}
		}

		return tmp;

	}

	// 계좌주 정보 조회 메소드 추가
	// -> 이름/ 전화번호 기준
	public AccountOwner personalSearch(String name, String phone) {

		AccountOwner tmp = null;

		for (AccountOwner a : accountOwner) {

			if (a.getName().equals(name) && a.getPhone().equals(phone)) {
				tmp = a;
			}
		}

		return tmp;

	}

	// 계좌입출금내역 출력 메소드 추가
	// ->계좌번호 기준 + 내역출력시작일 이후
	public List<AccountHistory> accountIOPrint(String accountid, String value) {

		List<AccountHistory> tmp = new ArrayList<AccountHistory>();

		for (AccountHistory h : accountHistory) {
			if (h.getAccountId().equals(accountid) && h.getCreateDate().compareTo(value) >= 0) {
				tmp.add(h);
			}
		}

		return tmp;

	}

	// 계좌입금 메소드 추가
	public int accountHistoryAdd(String accountId, int money) {

		String addDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		int result = 0;

		// 1. 계좌번호, 입금액을 전달 받는다.

		// 2. 계좌번호의 현재 잔액 확인 -> account 객체
		Account a = this.accountId(accountId);

		if (a != null) {

			result = 1;

			int balance = a.getBalance() + money;

			// 3. AccounyHistory 객체 생성 -> 계좌번호, 입금액, 오늘날짜, 상태값, 잔액
			accountHistory.add(new AccountHistory(accountId, money, addDate, "입금", balance));

			// 4. AccounyHistory 컬렉션에 저장
			// 5. Account 컬렉션에 저장된 Account 객체의 정보 수정 -> 잔액, 마지막 거래일

			a.setBalance(balance);

			a.setLastUpdateDate(addDate);

		} else {
			result = 0;
		}

		// 6. 성공 여부 반환 -> 0 (실패) , 1 (성공)

		return result;
	}

	// 계좌출금 메소드 추가
	public int accountHistoryWithdraw(String accountId, int money, String pw) {

		String addDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		int result = 0;

		// 1. 계좌번호, 출금액, 비밀번호를 전달 받는다.
		// 2. 계좌번호의 현재 비밀번호, 잔액 확인 -> Account 객체
		// 3. 비밀번호 확인
		// 4. AccountHistory 객체 생성 -> 계좌번호, 출금액, (오늘)날짜, 상태값, 잔액
		// 5. AccountHistory 컬렉션에 저장
		// 6. Account 컬렉션에 저장된 Account 객체의 정보 수정 -> 잔액, 마지막거래일
		// 7. 성공 여부 반환 -> 0(존재하지 않는 계좌), 1(틀린 비밀번호), 2(성공)

		Account a = this.accountId(accountId);

		if (a != null && a.getPw().equals(pw) && a.getBalance() >= money) {

			result = 2;

			int balance = a.getBalance() - money;

			accountHistory.add(new AccountHistory(accountId, money, addDate, "출금", balance));

			a.setBalance(balance);

			a.setLastUpdateDate(addDate);

		} else if (a.getPw().equals(pw)) {
			result = 1;
		} else if (a.getBalance() >= money) {
			result = 0;
		}

		return result;
	}

	// Account 객체 탐색 메소드 추가 -> private 메소드
	public Account accountId(String accountId) {

		Account result = null;

		for (Account a : account) {
			if (a.getAccountId().equals(accountId)) {
				result = a;
			}
		}

		// 탐색 진행

		return result;
	}

	// 계좌 생성 메소드
	public void newAccountAdd(String accountId, String pw, int balance, String accountOwnerId) {

		String addDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		this.account.add(new Account(accountId, accountOwnerId, balance, addDate, pw, addDate));
	}

	// 사용자 정보 추가 메소드
	public void newOwnerAdd(String accountOwnerId, String name, String phone) {
		// 추가 액션
		this.accountOwner.add(new AccountOwner(accountOwnerId, name, phone));
	}

	// 계좌주 고유 번호 자동생성 메소드
	public String newAccountOwnerId() {

		String result = String.format("A%04d", this.accountOwner.size() + 1);

		return result;
	}

	// 직렬화 메소드 추가
	// -> 저장소별로 직렬화 진행
	// -> accounts.dat, accountHistory.dat, ...
	public void serializable() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("account.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(account);
			fos = new FileOutputStream("accountOwner.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(accountOwner);
			fos = new FileOutputStream("accountHistory.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(accountHistory);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// 역직렬화 메소드 추가
	// -> 파일별로 역직렬화 진행
	// -> accounts.dat, accountHistory.dat, ...
	@SuppressWarnings({ "unchecked", "unused" })
	public void reSerializable() {
		File file1 = new File("account.dat");
		File file2 = new File("accountHistory.dat");
		File file3 = new File("accountOwner.dat");

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		List<Account> file1tmp = null;
		List<AccountHistory> file2tmp = null;
		List<AccountOwner> file3tmp = null;

		if (file1.exists() && file2.exists() && file3.exists() == true) {
			try {
				try {
					fis = new FileInputStream(file1);
					ois = new ObjectInputStream(fis);
					file1tmp = (List<Account>) ois.readObject();
					
					fis = new FileInputStream(file2);
					ois = new ObjectInputStream(fis);
					file2tmp = (List<AccountHistory>) ois.readObject();
					
					fis = new FileInputStream(file3);
					ois = new ObjectInputStream(fis);
					file3tmp = (List<AccountOwner>) ois.readObject();
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} else if(file1.exists() && file2.exists() && file3.exists() != true){
			System.out.println("계좌관리를 최초 시작합니다.");
		}

	}

}
