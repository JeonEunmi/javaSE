package com.member04;

import java.util.Scanner;

public class MemberList {
	
	// �ʵ� ���� -> ����� � -> ����� �迭 10��
	
	private Member[] memberArray = new Member[10];
	
	// ������ ���� -> �ʵ� �ʱ�ȭ
	
	private int idx;
	
	
	public MemberList() {
		Member m = new Member("M01", "HONG", "010-2222-2222", "mail@do.com", "2018-07-18");
		
		memberArray[this.idx]= m;
		
		++this.idx;
	}
	
	//�ڵ� ��ȣ ���� �׼� �޼ҵ�
	public String autoMid() {
		return String.format("M%02d", (this.idx)+1);
	}
	
	//ȸ������ �Է� �׼� �޼ҵ�
	public void join(Member m) {
		// �迭 ����ҿ� Member ��ü ������ �� �ִ� �޼ҵ� ȣ��
		this.memberArray[this.idx] = m;
		
		// �ε��� ��ȣ 1 ����
		++this.idx;
	}
	
	//ȸ�������� ��ȯ�ϴ� �޼ҵ�
	public Member[] memberOutput() {
		Member[] result = new Member[this.idx];
		
		int a = 0;
		
		for(Member i : this.memberArray) {
			if(i != null) {
				result[a] = i;
				++a;
			}
		}
		return result;
	}
	
	
	public Member[] memberSearchName(String name) {
		int count = 0;
		
		for(int i = 0; i < this.idx; ++i) {
			if(this.memberArray[i].getName().equals(name)) {
				++count;
				}
			} 
		Member[] result = new Member[count];
		
		int a = 0;
		
		for(int i = 0; i < this.idx; ++i) {
			if(this.memberArray[i].getName().equals(name)) {
				result [a] = this.memberArray[i];
				++a;
				}
			} 
		
		return result;
	}
	
	public Member[] memberSearchCallNum(String callNum) {
		
		int count = 0;
		
		for(int i = 0; i < this.idx; i++) {
			if(this.memberArray[i].getCallNum().indexOf(callNum) != -1) {
				++count;
			}
		}
		
		Member[] result = new Member[count];
		
		int a = 0;
		
		for(int i = 0; i < this.idx; i++) {
				if(this.memberArray[i].getCallNum().indexOf(callNum) != -1) {
					result [a] = this.memberArray[i];
					++a;
				}
			}		
		return result;
		}
	
	
	public Member[] memberSearchMail(String mail) {
		
		int count = 0;
		
		for(int i = 0; i < this.idx; i++) {
			if(this.memberArray[i].getMail().indexOf(mail) != -1) {
				++count;
			}
		}
		
		Member[] result = new Member[count];
		int a = 0;
		
		for(int i = 0; i < this.idx; i++) {
			if(this.memberArray[i].getMail().indexOf(mail) != -1) {
				result [a] = this.memberArray[i];
				++a;
			}
		}			
		
		return result;
	}
	
	public Member[] memberSearchRegDate(String regDate) {

		int count = 0;
		
		for(int i = 0; i < this.idx; ++i) {
			if(((this.memberArray[i].getRegistrationDate()).substring(0, 7)).equals(regDate)) {
				++count;
			} 
		}
		
		Member[] result = new Member[count];
		
		int a = 0;
		
		for(int i = 0; i < this.idx; i++) {
			if(((this.memberArray[i].getRegistrationDate()).substring(0, 7)).equals(regDate)) {
				result [a] = this.memberArray[i];
				++a;
			} 
		}
			
		
		return result;
	}

}
