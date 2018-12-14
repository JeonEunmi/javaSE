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

	// clone() 메소드에 대한 오버라이딩
	// -> 깊은 복제
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복사를 위한 전용 코드 작성
		// -> 배열 객체에 대한 사본 배열 객체 생성 과정 추가
		
		// 1단계. 먼저 얕은 복사를 한다.
		// 기본 자료형은 얕은 복사만으로도 값복사가 이루어지기 때문에
		Super cloned = (Super) super.clone();
		
		// 2단계. a 배열을 깊은 복사한다. 나 자신의 객체를 나 자신의 배열 길이만큼 복사
		cloned.a = Arrays.copyOf(this.a, this.a.length);
		return cloned;
	}
	
	
	
}
