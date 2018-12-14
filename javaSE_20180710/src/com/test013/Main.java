package com.test013;

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
		 */
		
		Test t = new Test();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("로또 몇장 사실건가요? (1~10) > ");
		
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("===============================");
		
		int[] count = new int[6];
		
		for(int i = 1; i <= number; ++i) {
			count = t.lotto();
			System.out.println(Arrays.toString(count));
		}
		
		scanner.close();
		
	}

}
