package com.schedule110;

import java.io.*;
import java.util.*;

// ����� �
public class ScheduleList {

	// �ʵ� ���� -> List �÷��� ����� �
	private List<Schedule> scheduleArray = new ArrayList<Schedule>();

	// ������ -> �ʵ� �ʱ�ȭ
	public ScheduleList() {

		this.scheduleArray.add(new Schedule("S001", "2018-01-01", "����"));
		this.scheduleArray.add(new Schedule("S002", "2018-12-25", "ũ��������"));
		this.scheduleArray.add(new Schedule("S003", "2018-06-06", "������"));
		this.scheduleArray.add(new Schedule("S004", "2018-08-15", "������"));
		this.scheduleArray.add(new Schedule("S005", "2018-03-01", "������"));
		this.scheduleArray.add(new Schedule("S006", "2018-10-03", "��õ��"));
		this.scheduleArray.add(new Schedule("S007", "2018-10-09", "�ѱ۳�"));

	}

	// ��ȣ �ڵ� ���� �޼ҵ�
	public String autoGid() {

		String result = "";
		result = String.format("S%03d", (this.scheduleArray.size() + 1));
		return result;

	}

	// ������ �Է�
	public void scheduleAdd(Schedule schedule) {

		this.scheduleArray.add(schedule);

	}

	// ��� �޼ҵ�
	public List<Schedule> allSchedule() {

		return this.scheduleArray;

	}

	// private method
	// -> �˻� ���� �޼ҵ�
	// -> �˻� ������ �Ű� ������ String key, String value�� ����
	public List<Schedule> scheduleSearch(String key, String value) {

		// key -> �˻� ����, ���� ���, "Ư����"
		// value -> �˻� �ܾ�. ���� ��� "2018-07-19"
		// �˻� ����� null �� ����

		// �˻� ��� ����� �ӽ� �迭 �غ�
		List<Schedule> scheduleList = new ArrayList<Schedule>();

		// �迭 ����ҿ� �ִ� ���� ������ �˻��ϱ� ���� �ݺ���
		for (Schedule s : this.scheduleArray) {

			String temp = null;
			if (key.equals("today") || key.equals("day") || key.equals("month")) {
				temp = s.getScheduleDate();
			}

			if (key.equals("content")) {
				temp = s.getScheduleContent();
			}

			if (key.equals("sid")) {
				temp = s.getSid();
			}

			if (temp.contains(value)) {
				scheduleList.add(s);
			}
		}

		return scheduleList;
	}

	// �κ� ���� ������ ���� �޼ҵ� �߰�
	public int scheduleRemove(String key, String value) {

		int count = 0;

		for (int a = 0; a < this.scheduleArray.size(); ++a) {
			Schedule s = this.scheduleArray.get(a);

			// Ư�� ��ȣ ���� ���� ����
			if (key.equals("sid") && s.getSid().equals(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// Ư�� �� ���� ���� ����
			if (key.equals("day") && s.getScheduleDate().equals(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// Ư�� �� ���� ���� ����
			if (key.equals("month") && s.getScheduleDate().contains(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// Ư�� �ܾ� ���� ���� ����
			if (key.equals("content") && s.getScheduleContent().contains(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

		}

		return count;
	}

	// ��ü ���� ������ ���� �޼ҵ� �߰�
	public int scheduleRemoveAll() {
		// ����ҿ� ����� ��� ���� ����
		int result = this.scheduleArray.size();

		this.scheduleArray.clear();

		return result;
	}

	// ����ȭ �޼ҵ� �߰�
	public void Serializable() {
		// List �÷����� ���°� ��ü��
		// scheduleList.dat ���Ϸ� ����
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("scheduleList.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(scheduleArray);

			System.out.println("List<Schedule> scheduleList -> scheduleList.dat");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	// ������ȭ �޼ҵ� �߰�
	@SuppressWarnings("unchecked")
	public void reSerializable() {
		
		// ���Ϸ� ����� scheduleList.dat ������ �о�鿩��
		// List �÷��� ����ҿ� �Ҵ�
		// ����) ���� ����� scheduleList.dat ������ �������� �ʴ´�.
		//    -> ���� ���� ���� �˻� ���� �߰� 
		
		File file = new File("scheduleList.dat");
		
		@SuppressWarnings("unused")
		List<Schedule> schtmp = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if(file.exists() == true) {
			
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				
				schtmp = (List<Schedule>)ois.readObject();
				System.out.println("scheduleList.dat -> List<Schedule> scheduleList");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					} 
				}
				if(ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					} 
				}
			}
			
			this.scheduleArray = schtmp;
			
		} else if(file.exists() != true){
			System.out.println("���������� ���� �����մϴ�.");
		}
		
		
		
	}

}
