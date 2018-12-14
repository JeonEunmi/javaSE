package com.test082;

public class Main {

	public static void main(String[] args) {

		// 원본 객체
		Super s1 = new Super(10);
		System.out.println(s1.getA()[0]);  // 10
		
		
		// 사본 객체 -> 실제 메모리에서 두 개의 Super 객체. 두 개의 배열 객체.
		try {
			Super s3 = (Super) s1.getCopy();
			System.out.println(s3.getA()[0]); // 10
			s3.updateA(30);
			System.out.println(s1.getA()[0]);  // 10
			System.out.println(s3.getA()[0]); // 30
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
