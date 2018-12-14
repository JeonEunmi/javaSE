package com.test;

public class Sample053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 for문을 이용한 숫자 출력
		/*
    	1 2 3 4 5 6 7 8 9 10 
     	1 2 3 4 5 6 7 8 9
     	1 2 3 4 5 6 7 8
     	1 2 3 4 5 6 7
     	1 2 3 4 5 6
     	1 2 3 4 5 
     	1 2 3 4 
     	1 2 3 
     	1 2 
     	1 
     */
		for (int a = 1; a <= 10; ++a) {
			for (int b = 1; b <= (11 - a); ++b) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
