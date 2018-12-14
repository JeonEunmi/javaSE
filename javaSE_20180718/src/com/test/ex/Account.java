package com.test.ex;

public class Account {

	//저장소
	
	private String ano;
	private String owner;
	private int balance;
	
	//기본생성자
	public Account() {
		
	}
	
	//매개변수생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter, setter
	public String getAno() {
		return this.ano;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//toString
	
	public String toString() {
		String result = "";
		result = String.format("%s, %s, %s", this.getAno(), this.getOwner(), this,getBalance());
		return result;
	}
	
}
