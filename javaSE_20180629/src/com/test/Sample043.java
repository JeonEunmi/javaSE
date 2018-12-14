package com.test;

public class Sample043 {

	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5 6 7 8 9 10 -> 55
		 * 11 12 13 14 15 16 17 18 19 20 -> ??
		 * ...
		 * 91 92 93 94 95 96 97 98 99 100 -> ??
		 * ----------------------------------
		 * 5050
		 */
		
		int result = 0;
		for(int i = 1; i<=100; ++i) {
			result += i;
			System.out.print(i + " ");
			if(i%10 == 0) {
				System.out.print(" -> " +result);
				System.out.println();
			}
		}
		System.out.println("-----------------------------");
		System.out.println(result);

		}
	}

