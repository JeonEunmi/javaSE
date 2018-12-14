package com.test080;

public class Main {

	public static void main(String[] args) {

		Object o1 = new Object();

		o1.toString(); // public
		// o1.clone(); // protected이기 때문에 접근 불가
		
		// 원본 객체
		Super s1 = new Super(10);
		System.out.println(s1.getA());  // 10

		// 사본객체가 아니다. -> 실제 메모리에서는 한 개의 객체
		// 하나의 객체의 주소를 나눠가짐
		Super s2 = s1;
		System.out.println(s2.getA());  // 10
		s2.setA(20);
		System.out.println(s1.getA());  // 20
		// 사본 데이터를 변경하였지만, 원본 데이터에도 영향이 있음
		// 사본 데이터가 아님이 증명됨
		
		// 사본 객체 -> 실제 메모리에서는 두 개의 객체
		try {
			Super s3 = (Super) s1.getCopy();
			s3.setA(30);
			System.out.println(s1.getA());   // 20
			System.out.println(s3.getA());   // 30
		// 사본 데이터를 변경하였지만, 원본 데이터는 아무런 영향을 받지 않음
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
