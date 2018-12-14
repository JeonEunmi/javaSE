package com.test082;

import java.util.Arrays;

public class Super implements Cloneable{

	
	private int[] a = new int [1];
	
	public Super() {
		
	}
	
	public Super(int a) {
		this.a[0] = a;
	}
	
	public int[] getA() {
		return this.a;
	}
	
	public void setA(int[] a) {
		this.a = a;
	}
	
	public void updateA(int a) {
		this.a[0] = a;
		
	}
	
	public Super getCopy() throws CloneNotSupportedException {
		return (Super) this.clone(); 
	}

	// clone() �޼ҵ忡 ���� �������̵�
	// -> ���� ����
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���縦 ���� ���� �ڵ� �ۼ�
		// -> �迭 ��ü�� ���� �纻 �迭 ��ü ���� ���� �߰�
		
		// 1�ܰ�. ���� ���� ���縦 �Ѵ�.
		// �⺻ �ڷ����� ���� ���縸���ε� �����簡 �̷������ ������
		Super cloned = (Super) super.clone();
		
		// 2�ܰ�. a �迭�� ���� �����Ѵ�. �� �ڽ��� ��ü�� �� �ڽ��� �迭 ���̸�ŭ ����
		cloned.a = Arrays.copyOf(this.a, this.a.length);
		return cloned;
	}
	
	
	
}
