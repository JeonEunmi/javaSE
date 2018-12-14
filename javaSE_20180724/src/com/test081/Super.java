package com.test081;

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
	
	
}
