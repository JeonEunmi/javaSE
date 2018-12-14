package com.test01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Schedule[] a = new Schedule[10];
		
		a[0] = new Schedule("S001", "2018-01-01", "신정");
		a[1] = new Schedule("S002", "2018-12-25", "크리스마스");
		a[2] = new Schedule("S003", "2018-08-15", "광복절");
		a[3] = new Schedule("S004", "2018-06-06", "현충일");
		
		// 정렬 전
		System.out.println("---------------");
		for( Schedule s : a) {
			System.out.println(s.toString());
		}
		
		// 정렬 액션 추가
		// -> null 값이 없는 배열인 경우만 정상 실행
		Arrays.sort(a);

		// 정렬 후
		System.out.println("---------------");
		for( Schedule s : a) {
			if(s != null)
			System.out.println(s.toString());
		}
	}

}
