package com.test138;

import java.io.*;
import java.util.*;

public class Main2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Schedule Ŭ������ ��ü(instance)��(�÷���)�� ����ȭ ��Ų��.
		//->Serializable �������̽� ���� �ʿ�
		//��� �÷��� Ŭ������ ����ȭ ����
		
		List<Schedule> schedule = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			//�ֽ�Ʈ��
			fis = new FileInputStream("scheduleList.dat");

			//������Ʈ��
			ois = new ObjectInputStream(fis);
			
			//����(���̳ʸ� ����)->��ü(instance)
			//������ȭ
			schedule = (List<Schedule>)ois.readObject();
			
			System.out.println("scheduleList.dat -> List<Schedule> schedule");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException  e) {
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
		 
		
		for (Schedule s : schedule) {
			System.out.println(s);
		}
		
	}

}
