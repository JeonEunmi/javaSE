package com.test135;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// ��ü ����� ���� ��Ʈ��
		// ��ü(instance) -> ���� -> ��ü(instance)
		// -> ObjectInputStream, ObjectOutputStream
		// -> ����ȭ ��� ����(Serializable �������̽�)

		// String Ŭ����
		/*
		 * public final class String extends Object implements Serializable,
		 * Comparable<String>, CharSequence
		 */

		// �� ��Ʈ��

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("object.dat");

			// ���� ��Ʈ��
			oos = new ObjectOutputStream(fos);

			// ����ȭ�� ������ Ŭ������ �ν��Ͻ� �غ�
			String s = new String("hong / 010-1234-1234");

			// ��ü(instance) -> ����(���̳ʸ� ����)
			// ����ȭ
			oos.writeObject(s);
			
			System.out.println("String ��ü -> object.dat");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
