package com.test029;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 숫자들 중에서 가장 작은 수, 큰 수 찾아서 출력
		// -> 배열(또는 컬렉션) 저장소 이용
		
		int[] arr = {5, 3, 4, 7, 9, 2, 6, 1, 8, 10};
		
		Test t = new Test();
		
		System.out.println("min : " + t.minFunction(arr));  //1
		System.out.println("max : " + t.maxFunction(arr));  //10
	
		
		//Passing Parameters by Value
		//-> 매개변수에 전달되는 자료형이 기본형인 경우 값 복사에 의한 전달이 된다.
		//-> 메소드 내에서 발생하는 결과를 돌려받기 위해서 return 구문 필수
		//-> 예를 들어, 숫자 10, 20을 전달 후, 합산 결과를 반환받는다.
		
		int a = 10;
		int b = 20;
		System.out.println("by Value : " + t.sum(a, b)); // 30
		
		int[] c = {10, 20, 0};
		t.test(c);
		System.out.println("by Reference : " + c[2]);  //30
		
		//대표적인 by Reference 상황이 Arrays.sort() 메소드 이다.
		int[] d = {5, 3, 4, 7, 9, 2, 6, 1, 8, 10};
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
		System.out.println(d[0]); //min
		System.out.println(d[9]); //max
		}
		

}
