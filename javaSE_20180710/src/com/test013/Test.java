package com.test013;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	// �ߺ����� ���� ��ȣ�� ���� �ζǹ�ȣ(6��) ��ȯ �޼ҵ�
	// ��ȯ �ڷ��� -> int[]
	public int[] lotto() {
		
		int[] result = new int[6];
		
		int tmp = 0;
		
		for(int i=0; i<result.length; ) {
			tmp = (int)(Math.random()*45)+1;
			boolean flag = true;
			
			for(int j=0; j<result.length; ++j) {
				if(tmp == result[j]) {
					flag = false;
				}
			}
			if(flag) {
				result[i] = tmp;
				++i;
		

			}
		}
		
		// ��ȯ �� �迭 ��� ���� �׼� �߰�
		Arrays.sort(result);
		
	
		return result;
	}
	
}
