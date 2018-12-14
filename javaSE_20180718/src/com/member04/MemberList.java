package com.member04;

import java.util.Scanner;

public class MemberList {
	
	// 필드 선언 -> 저장소 운영 -> 저장소 배열 10명
	
	private Member[] memberArray = new Member[10];
	
	// 생성자 선언 -> 필드 초기화
	
	private int idx;
	
	
	public MemberList() {
		Member m = new Member("M01", "HONG", "010-2222-2222", "mail@do.com", "2018-07-18");
		
		memberArray[this.idx]= m;
		
		++this.idx;
	}
	
	//자동 번호 증가 액션 메소드
	public String autoMid() {
		return String.format("M%02d", (this.idx)+1);
	}
	
	//회원정보 입력 액션 메소드
	public void join(Member m) {
		// 배열 저장소에 Member 객체 저장할 수 있는 메소드 호출
		this.memberArray[this.idx] = m;
		
		// 인덱스 번호 1 증가
		++this.idx;
	}
	
	//회원정보를 반환하는 메소드
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
