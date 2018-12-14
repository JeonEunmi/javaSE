package com.test136;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// ��ü ����� ���� ��Ʈ��
		// ��ü(instance) -> ���� -> ��ü(instance)
		// -> ObjectInputStream, ObjectInputStream
		// -> ����ȭ ��� ����(Serializable �������̽�)

		// String Ŭ����
		/*
		 * public final class String extends Object implements Serializable,
		 * Comparable<String>, CharSequence
		 */

		// �� ��Ʈ��

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("object.dat");

			// ���� ��Ʈ��
			ois = new ObjectInputStream(fis);
			
			// ����(���̳ʸ� ����) -> ��ü(instance)
			// ������ȭ
			String s = (String)ois.readObject();
			System.out.println(s);

			System.out.println("object.dat -> String ��ü");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
