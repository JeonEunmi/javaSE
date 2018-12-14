package com.bankAccount.persistance;

import java.util.ArrayList;
import java.util.List;

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
		this.account.add(new Account("2018030101", "A0001", 0, "20171010", "1234", "20180101"));

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
						a.getLastUpdateDate(), owner.getName(),
						owner.getPhone()));
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
						a.getLastUpdateDate(), owner.getName(),
						owner.getPhone()));
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

	// ��������ݳ��� ��� �޼ҵ� �߰�
	// ->���¹�ȣ ���� + ������½����� ����
	public List<AccountHistory> accountIOPrint(String accountid, String value) { 
		
		List<AccountHistory> tmp = new ArrayList<AccountHistory>();
		
		for(AccountHistory h : accountHistory) {
			if(h.getAccountId().equals(accountid) && h.getCreateDate().compareTo(value) >= 0) {
				tmp.add(h);
			}
		}
		
		
		return tmp;

	}

}
