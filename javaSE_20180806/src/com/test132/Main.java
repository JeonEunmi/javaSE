package com.test132;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		// ǥ�� ����� ��ġ(Ű����, �ܼ�)�� �̿��� I/O Ŭ����
		// ->System.in , System.out
		
		InputStream is = System.in;
		
		try {
			int a = is.read();
			System.out.println(a); // ASCII �ڵ� ���
			System.out.println((char)a); // ����
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

