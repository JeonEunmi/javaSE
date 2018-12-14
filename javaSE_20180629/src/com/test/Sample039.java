package com.test;

public class Sample039 {

	public static void main(String[] args) {
		// 1부터 10까지 수를 출력
		for(int i=1; i<=10; ++i) {
			System.out.println(i);
		}
		
		// 1부터 100까지 수를 출력
		for(int i=1; i<=100; ++i) {
			System.out.println(i);
		}
		
		// 1부터 100까지의 수를 출력. 단, 짝수만 출력
		for(int i=1; i<=100; ++i) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		
		// 1부터 100까지의 수를 출력. 단, 3의 배수만 출력
				for(int i=1; i<=100; ++i) {
					if(i%3==0) {
					System.out.println(i);
					}
				}

			}
	}

