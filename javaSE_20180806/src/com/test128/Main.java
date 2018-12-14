package com.test128;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// byte ���� File I/O �׼� Ŭ����
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			
			// ���α׷� ���� ����ġ�� input.txt ������ ���������� ���� �غ�
			in = new FileInputStream("input.txt");
			// output.txt ������ ������ ������μ� �����ȴ�.
			out = new FileOutputStream("output.txt");
			
			int count = 0;

			int c;
			// read() �޼ҵ带 �̿��ؼ� byte ������ �б� ����
			while ((c = in.read()) != -1) {
				// wirte() �޼ҵ带 �̿��ؼ� byte ������ ���� ����
				out.write(c);
				++count;
			}
			System.out.println(count);
			System.out.println("input.txt -> output.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
