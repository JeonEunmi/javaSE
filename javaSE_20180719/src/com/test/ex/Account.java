package com.test.ex;
//�ڷ��� Ŭ���� ����
public class Account {
	
	//�ڷ� �׸� ���� �ʵ� ����
	//->ano(���¹�ȣ-���ڿ�), owner(������-���ڿ�), balance(�ܾ�-����)
	private String ano;
	private String owner;
	private int balance;

	//������ -> �⺻ ������, �Ű����� �ִ� ������
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
	//toString() �޼ҵ�
	public String toString(){
		String result = "";
		result = String.format("%s  /  %s  /  %s", this.getAno(), this.getOwner(), this.getBalance());
		return result;
	}

}