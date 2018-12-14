package com.test130;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		FileReader in = null;
		FileWriter out = null;

		try {
			
			// ���α׷� ���� ����ġ�� input.txt ������ ���������� ���� �غ�
			in = new FileReader("input.txt");
			// output.txt ������ ������ ������μ� �����ȴ�.
			out = new FileWriter("output.txt");
			
			int count = 0;

			int c;
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
			// TODO Auto-generated catch block			e.printStackTrace();
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