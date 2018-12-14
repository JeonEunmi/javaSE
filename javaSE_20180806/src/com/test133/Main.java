package com.test133;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 표준 입출력 장치(키보드, 콘솔)를 이용한 I/O 클래스
		// ->System.in , System.out
		// -> Scanner 클래스

		Scanner sc = new Scanner(System.in);

		// 문자로 입력했지만 내부적으로 형변환 진행
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println(a);

		// 한 문자씩 입력했지만 단어 단위로 문자열 변환
		// 단어와 단어를 공백으로 구분
		String b = sc.next();
		String c = sc.next();
		sc.nextLine();
		System.out.printf("%s, %s%n", b, c);

		// 한 문자씩 입력했지만 문장 단위로 문자열 변환
		String d = sc.nextLine();
		System.out.println(d);

	}

}
