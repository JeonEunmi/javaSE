package com.test;

import java.util.Arrays;

public class JavaEx2 {

	public static void main(String[] args) {
		
		int count = 5;
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int num = a.length / count;
		
		// 2���� �迭 b ����
		int[][] b = new int[num][];

		// �迭 b�� �迭 a ����
		for(int i=0; i<b.length; ++i){
				b[i] = Arrays.copyOfRange(a, i*count, i*count+count);
				
			}
		
		for(int i=0; i<b.length; ++i) {
			System.out.println(Arrays.toString(b[i]));
		}
		
		
		}
		

	}

