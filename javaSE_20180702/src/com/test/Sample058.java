package com.test;

import java.util.Scanner;

public class Sample058 {

	public static void main(String[] args) {
		// 외부(키보드) 입력
		// ->java.util 패키지의 Scanner 클래스
		
		// 특정 문자열이 입력(예를 들어, quit) 될 때까지 무한 실행
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		do {
			// 입력받은 문자열 출력
			System.out.println("종료를 원하시면 quit를 입력해주세요. >");
			// 문자열에 대한 외부 입력
			s = sc.nextLine();
			// 입력 받은 문자열이 "quit" 인 경우 반복문 종료	
		}while(!s.equals("quit"));
		
		sc.close();
		
	}
}
