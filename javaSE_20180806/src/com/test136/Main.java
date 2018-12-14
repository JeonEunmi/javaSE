package com.test136;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// 객체 입출력 보조 스트림
		// 객체(instance) -> 파일 -> 객체(instance)
		// -> ObjectInputStream, ObjectInputStream
		// -> 직렬화 기능 구현(Serializable 인터페이스)

		// String 클래스
		/*
		 * public final class String extends Object implements Serializable,
		 * Comparable<String>, CharSequence
		 */

		// 주 스트림

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("object.dat");

			// 보조 스트림
			ois = new ObjectInputStream(fis);
			
			// 파일(바이너리 형식) -> 객체(instance)
			// 역직렬화
			String s = (String)ois.readObject();
			System.out.println(s);

			System.out.println("object.dat -> String 객체");

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
