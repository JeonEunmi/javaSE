package com.test;

import java.util.*;

public class JavaEx {
	public static void main(String[] args) {
		
		int num = 0;
		int[] lotto = new int[6];

		num = (int)(Math.random()*45)+1;

		for (int i = 0; i < lotto.length;) {
			int tmp = (int) (Math.random() * 45) + 1;
			boolean flag = true;

			for (int j = 0; j < i; ++j) {
				if (tmp == lotto[j]) {
					flag = false;
				}
			}
			if (flag) {
				lotto[i] = tmp;
				++i;
			}
		}

		//Á¤·Ä
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
	

	}
}