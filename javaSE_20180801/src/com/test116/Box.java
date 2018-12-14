package com.test116;

public class Box<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "오버라이딩 메소드";
	}

}
