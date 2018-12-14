package com.test135;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// 객체 입출력 보조 스트림
		// 객체(instance) -> 파일 -> 객체(instance)
		// -> ObjectInputStream, ObjectOutputStream
		// -> 직렬화 기능 구현(Serializable 인터페이스)

		// String 클래스
		/*
		 * public final class String extends Object implements Serializable,
		 * Comparable<String>, CharSequence
		 */

		// 주 스트림

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("object.dat");

			// 보조 스트림
			oos = new ObjectOutputStream(fos);

			// 직렬화가 가능한 클래스의 인스턴스 준비
			String s = new String("hong / 010-1234-1234");

			// 객체(instance) -> 파일(바이너리 형식)
			// 직렬화
			oos.writeObject(s);
			
			System.out.println("String 객체 -> object.dat");

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
