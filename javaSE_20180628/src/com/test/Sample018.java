package com.test;

public class Sample018 {

	public static void main(String[] args) {
		
		
		// 연산자
		
		// 3자리 이상 숫자에서 백단위 이상만 출력
		// 예를들어, 1234는 1200 출력
		// -> 절삭 (몫 연산 수행 후 곱하기 100)
		
		int a = 356;
		System.out.println(a);
		System.out.println(a / 100 * 100);

	}

}
 