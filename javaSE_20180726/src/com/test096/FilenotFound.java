package com.test096;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound {

	public static void main(String[] args) {

		// ���� �߻� ������ �ڵ� �ۼ�
		
		// ���� ó�� �ڵ� �߰�
		// (������) ���� ����� �ڵ�
		File file = new File("C:\\������_20180625~20190117\\01.javaSE\\������_20180706.txt");
		
		try {
			FileReader fr = new FileReader(file);
			System.out.println("���� ����");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("������ ����");
		}
	}

}
