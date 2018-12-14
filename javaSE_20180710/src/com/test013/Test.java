package com.test013;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	// 중복되지 않은 번호를 가진 로또번호(6개) 반환 메소드
	// 반환 자료형 -> int[]
	public int[] lotto() {
		
		int[] result = new int[6];
		
		int tmp = 0;
		
		for(int i=0; i<result.length; ) {
			tmp = (int)(Math.random()*45)+1;
			boolean flag = true;
			
			for(int j=0; j<result.length; ++j) {
				if(tmp == result[j]) {
					flag = false;
				}
			}
			if(flag) {
				result[i] = tmp;
				++i;
		

			}
		}
		
		// 반환 전 배열 요소 정렬 액션 추가
		Arrays.sort(result);
		
	
		return result;
	}
	
}
