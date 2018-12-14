package com.test;

import java.util.Arrays;

public class Sample095 {

	public static void main(String[] args) {
		
		// 배열 저장소 확장
		// 배열은 생성될 때 지정된 크기를 변경할 수 없다.
		// -> 새로운 배열(확장된 크기)을 준비하고, 기존 배열의 자료를 복사
		// -> 기존 배열을 메모리에서 제거 (참조주소 바꿔치기)
		
		int[] a = {10, 20, 30, 40, 50};
		// 낭비되지 않는 범위에서 적절하게 크기 확장
		int[] b = Arrays.copyOf(a, a.length * 2);  
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		// 참조주소를 새로운 주소로 변경 
		// 기존 참조주소는 쓰레기가 되어 가비지컬렉터에 의해 삭제됨
		a = Arrays.copyOf(a, a.length + 5);  
		System.out.println(Arrays.toString(a));
		
		a = Arrays.copyOf(a, a.length + 5);  
		System.out.println(Arrays.toString(a));

	}

}
