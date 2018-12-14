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

// �ڷ� ����� � Ŭ����
public class AccountDAO {

	// List �÷��� �����
	List<Account> account = new ArrayList<Account>();
	List<AccountHistory> accountHistory = new ArrayList<AccountHistory>();
	List<AccountOwner> accountOwner = new ArrayList<AccountOwner>();

	public AccountDAO() {
		// �ʱ� ���� ������ �غ�
		// ���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ��й�ȣ / ������ ���� ��ȣ
		// 2018030101 / 200000 / 20171010 / 20180101 / 1234 / A0001
		this.account.add(new Account("2018030101", "A0001", 200000, "20171010", "1234", "20180101"));

		// ������ ���� ��ȣ / ������ / ��ȭ��ȣ
		// A0001 / �ڱ浿 / 010-5678-1234
		this.accountOwner.add(new AccountOwner("A0001", "�ڱ浿", "010-5678-1234"));

		// ���¹�ȣ / �ݾ� / ������� / ���� / �ܾ�
		// 2018030101 / 100000 / 20171010 / �Ա� / 100000
		// 2018030101 / 100000 / 20180101 / �Ա� / 200000
		this.accountHistory.add(new AccountHistory("2018030101", 100000, "20171010", "�Ա�", 100000));
		this.accountHistory.add(new AccountHistory("2018030101", 100000, "20180101", "�Ա�", 200000));

	}

	// ������ȸ �޼ҵ� �߰�
	// ���¹�ȣ ����
	public List<AccountList> accountIDSearch(String value) {

		List<AccountList> list = new ArrayList<AccountList>();
		// ���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ
		for (Account a : this.account) {
			AccountOwner owner = this.personalIDSearch(a.getAccountOwnerId());
			if (a.getAccountId().equals(value)) {
				list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(),
						a.getLastUpdateDate(), owner.getName(), owner.getPhone()));
			}
		}
		return list;
	}

	// ������ȸ �޼ҵ� �߰�
	// ������ �̸� / ��ȭ��ȣ ����
	public List<AccountList> accountPersonalSearch(String name, String phone) {

		List<AccountList> list = new ArrayList<AccountList>();
		// ���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ
		for (Account a : this.account) {
			AccountOwner owner = this.personalIDSearch(a.getAccountOwnerId());
			if (owner != null && owner.getName().equals(name) && owner.getPhone().equals(phone)) {
				list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(),
						a.getLastUpdateDate(), owner.getName(), owner.getPhone()));
			}
		}
		return list;
	}

	// ������ȸ �޼ҵ� �߰�
	// ��ü
	public List<AccountList> accountAllSearch() {

		List<AccountList> list = new ArrayList<AccountList>();
		// ���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ

		for (Account a : this.account) {
			list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(), a.getLastUpdateDate(),
					this.personalIDSearch(a.getAccountOwnerId()).getName(),
					this.personalIDSearch(a.getAccountOwnerId()).getPhone()));
		}
		return list;
	}

	// ������ ���� ��ȸ �޼ҵ� �߰�
	// -> ������ ���� ��ȣ ����
	public AccountOwner personalIDSearch(String value) {

		AccountOwner tmp = null;

		for (AccountOwner a : accountOwner) {

			if (a.getAccountOwnerId().equals(value)) {
				tmp = a;
			}
		}

		return tmp;

	}

	// ������ ���� ��ȸ �޼ҵ� �߰�
	// -> �̸�/ ��ȭ��ȣ ����
	public AccountOwner personalSearch(String name, String phone) {

		AccountOwner tmp = null;

		for (AccountOwner a : accountOwner) {

			if (a.getName().equals(name) && a.getPhone().equals(phone)) {
				tmp = a;
			}
		}

		return tmp;

	}

	// ��������ݳ��� ��� �޼ҵ� �߰�
	// ->���¹�ȣ ���� + ������½����� ����
	public List<AccountHistory> accountIOPrint(String accountid, String value) {

		List<AccountHistory> tmp = new ArrayList<AccountHistory>();

		for (AccountHistory h : accountHistory) {
			if (h.getAccountId().equals(accountid) && h.getCreateDate().compareTo(value) >= 0) {
				tmp.add(h);
			}
		}

		return tmp;

	}

	// �����Ա� �޼ҵ� �߰�
	public int accountHistoryAdd(String accountId, int money) {

		String addDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		int result = 0;

		// 1. ���¹�ȣ, �Աݾ��� ���� �޴´�.

		// 2. ���¹�ȣ�� ���� �ܾ� Ȯ�� -> account ��ü
		Account a = this.accountId(accountId);

		if (a != null) {

			result = 1;

			int balance = a.getBalance() + money;

			// 3. AccounyHistory ��ü ���� -> ���¹�ȣ, �Աݾ�, ���ó�¥, ���°�, �ܾ�
			accountHistory.add(new AccountHistory(accountId, money, addDate, "�Ա�", balance));

			// 4. AccounyHistory �÷��ǿ� ����
			// 5. Account �÷��ǿ� ����� Account ��ü�� ���� ���� -> �ܾ�, ������ �ŷ���

			a.setBalance(balance);

			a.setLastUpdateDate(addDate);

		} else {
			result = 0;
		}

		// 6. ���� ���� ��ȯ -> 0 (����) , 1 (����)

		return result;
	}

	// ������� �޼ҵ� �߰�
	public int accountHistoryWithdraw(String accountId, int money, String pw) {

		String addDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		int result = 0;

		// 1. ���¹�ȣ, ��ݾ�, ��й�ȣ�� ���� �޴´�.
		// 2. ���¹�ȣ�� ���� ��й�ȣ, �ܾ� Ȯ�� -> Account ��ü
		// 3. ��й�ȣ Ȯ��
		// 4. AccountHistory ��ü ���� -> ���¹�ȣ, ��ݾ�, (����)��¥, ���°�, �ܾ�
		// 5. AccountHistory �÷��ǿ� ����
		// 6. Account �÷��ǿ� ����� Account ��ü�� ���� ���� -> �ܾ�, �������ŷ���
		// 7. ���� ���� ��ȯ -> 0(�������� �ʴ� ����), 1(Ʋ�� ��й�ȣ), 2(����)

		Account a = this.accountId(accountId);

		if (a != null && a.getPw().equals(pw) && a.getBalance() >= money) {

			result = 2;

			int balance = a.getBalance() - money;

			accountHistory.add(new AccountHistory(accountId, money, addDate, "���", balance));

			a.setBalance(balance);

			a.setLastUpdateDate(addDate);

		} else if (a.getPw().equals(pw)) {
			result = 1;
		} else if (a.getBalance() >= money) {
			result = 0;
		}

		return result;
	}

	// Account ��ü Ž�� �޼ҵ� �߰� -> private �޼ҵ�
	public Account accountId(String accountId) {

		Account result = null;

		for (Account a : account) {
			if (a.getAccountId().equals(accountId)) {
				result = a;
			}
		}

		// Ž�� ����

		return result;
	}

	// ���� ���� �޼ҵ�
	public void newAccountAdd(String accountId, String pw, int balance, String accountOwnerId) {

		String addDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		this.account.add(new Account(accountId, accountOwnerId, balance, addDate, pw, addDate));
	}

	// ����� ���� �߰� �޼ҵ�
	public void newOwnerAdd(String accountOwnerId, String name, String phone) {
		// �߰� �׼�
		this.accountOwner.add(new AccountOwner(accountOwnerId, name, phone));
	}

	// ������ ���� ��ȣ �ڵ����� �޼ҵ�
	public String newAccountOwnerId() {

		String result = String.format("A%04d", this.accountOwner.size() + 1);

		return result;
	}

	// ����ȭ �޼ҵ� �߰�
	// -> ����Һ��� ����ȭ ����
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

	// ������ȭ �޼ҵ� �߰�
	// -> ���Ϻ��� ������ȭ ����
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
			System.out.println("���°����� ���� �����մϴ�.");
		}

	}

}
