package com.test014;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 문제)
		// 중복되지 않은 번호를 가진 로또번호(6개) 메소드 호출
		// 사용자가 원하는 장수만큼 한번에 출력되도록 한다.
		/*
		실행예)
		
		외부입력 ->  
		원하는 장수 (n) > 10
		
		출력결과
		1. [??, ??, ??, ??, ??, ??]
		2. [??, ??, ??, ??, ??, ??]
		3. [??, ??, ??, ??, ??, ??]
		4. [??, ??, ??, ??, ??, ??]
		5. [??, ??, ??, ??, ??, ??]
		
		추가)) 중복되는 번호가 나오지 않도록 처리
		 */
		
		Test t = new Test();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("로또 몇장 사실건가요? (1~10) > ");
		
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("===============================");
		
		// 로또 숫자 6개의 조합을 저장할 임시 저장소
		int[][] count = new int[number][];
		int[] tmp = new int [6];
		
	
		for(int i = 0; i < number; ) {
			boolean flag = true;
			tmp = t.lotto();

			for(int j =0; j < i; ++j) {
				if(Arrays.equals(tmp, count[j])){
					flag = false;
				}
			}
			
			// 중복 검사 통과한 경우만 출력
			if(flag) {
				count[i] = tmp;
				System.out.println(i+1 + ". " + Arrays.toString(count[i]));
				++i;
			}

		}
		
		scanner.close();
		
	}

}
