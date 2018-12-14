package com.test137;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Schedule Ŭ������ ��ü(instance)��(�÷���)�� ����ȭ ��Ų��.
		//->Serializable �������̽� ���� �ʿ�
		//��� �÷��� Ŭ������ ����ȭ ����
		
		List<Schedule> scheduleList = new ArrayList<Schedule>();

		scheduleList.add(new Schedule("S001", "2018-01-01", "����"));
		scheduleList.add(new Schedule("S002", "2018-02-16", "����"));
		scheduleList.add(new Schedule("S003", "2018-03-01", "������"));
		scheduleList.add(new Schedule("S004", "2018-05-05", "��̳�"));
		scheduleList.add(new Schedule("S005", "2018-05-22", "��ó�Կ��ų�"));
		scheduleList.add(new Schedule("S006", "2018-06-06", "������"));
		scheduleList.add(new Schedule("S007", "2018-08-15", "������"));
		scheduleList.add(new Schedule("S008", "2018-09-24", "�߼�"));
		scheduleList.add(new Schedule("S009", "2018-10-03", "��õ��"));
		scheduleList.add(new Schedule("S010", "2018-12-25", "��ź��"));
		scheduleList.add(new Schedule("S011", "2018-10-09", "�ѱ۳�"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			//�ֽ�Ʈ��
			fos = new FileOutputStream("scheduleList.dat");

			//������Ʈ��
			oos = new ObjectOutputStream(fos);
			
			//����ȭ�� ������ Ŭ������ �ν��Ͻ� �غ�
			//��ü(instance)->����(���̳ʸ� ����)
			//����ȭ
			oos.writeObject(scheduleList); //NotSerializableException
			
			System.out.println("List<Schedule> scheduleList -> scheduleList.dat");
		
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
