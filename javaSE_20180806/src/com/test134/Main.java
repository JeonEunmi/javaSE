package com.test134;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// ���� ���� �׼�(����, ���� ��) Ŭ����
		// ->File

		File file = new File("input.txt");

		// ������ ���� ���� Ȯ��
		System.out.println(file.exists());

		// ���� ��� �о����
		File file2 = new File("C:\\workspace\\01.javaSE\\javaSE_20180806");
		String[] list = file2.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		// ������ ���� ����
		File file3 = new File("output.txt");
		file3.delete();
	}

} 
