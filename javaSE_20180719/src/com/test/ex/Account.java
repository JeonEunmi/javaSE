package com.test.ex;
//자료형 클래스 선언
public class Account {
	
	//자료 항목에 따른 필드 구성
	//->ano(계좌번호-문자열), owner(계좌주-문자열), balance(잔액-숫자)
	private String ano;
	private String owner;
	private int balance;

	//생성자 -> 기본 생성자, 매개변수 있는 생성자
	public Account(){

	}

	public Account(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//getter, setter
	public String getAno(){
		return this.ano;
	}
	public String getOwner(){
		return this.owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	public int getBalance(){
		return this.balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	//toString() 메소드
	public String toString(){
		String result = "";
		result = String.format("%s  /  %s  /  %s", this.getAno(), this.getOwner(), this.getBalance());
		return result;
	}

}