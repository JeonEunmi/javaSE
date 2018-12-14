package com.schedule01;

import java.time.LocalDate;
import java.util.*;

// ����� + ���� �޴��� �׼� Ŭ���� ����
public class SubMain {

	// �ʵ� ���� -> �迭 ����� �
	private Schedule[] scheduleArray = new Schedule[10];

	private int idx;

	// ������ -> �ʵ� �ʱ�ȭ
	public SubMain() {
		scheduleArray[this.idx] = new Schedule("S001", "2018-01-01", "����");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S002", "2018-12-25", "ũ��������");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S003", "2018-06-06", "������");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S004", "2018-08-15", "������");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S005", "2018-03-01", "������");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S006", "2018-10-03", "��õ��");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S007", "2018-10-09", "�ѱ۳�");
		++this.idx;
	}

	// public method
	// 1. ���� �Է� �޴� �޼ҵ�
	public void scheduleAdd(Scanner sc) {
		// �ܼ� �׼� �ʿ�
		System.out.println("");
		System.out.print("��¥(YYYY-MM-DD)? ");
		String scheduleDate = sc.nextLine();
		System.out.print("����(200�� �̳�)? ");
		String scheduleContent = sc.nextLine();

		String sid = String.format("S%03d", (this.idx) + 1);

		this.scheduleArray[this.idx] = new Schedule(sid, scheduleDate, scheduleContent);
		++this.idx;
		System.out.println("������ �ԷµǾ����ϴ�.");

		if (this.scheduleArray.length == this.idx) {
			this.extendArray(this.scheduleArray);
		}
	}

	// public method
	// 2. ���� ��� �� �˻� �޴� �޼ҵ�
	public void scheduleSearch(Scanner sc) {

		while (true) {

			System.out.println();
			System.out.println("======================================================");
			System.out.println("1. ���� ����  |  2. Ư�� �� ����  |  3. Ư�� �� ���� ");
			System.out.println("4. Ư�� �ܾ� ���� ����  |   5. ��ü ����   |  6. ����");
			System.out.println("======================================================");
			System.out.print("����> ");

			int selectNo = 0;

			selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 6)
				break;

			switch (selectNo) {

			case 1:
				this.todaySchedule();
				break;
			case 2:
				this.daySchedule(sc);
				break;
			case 3:
				this.monthSchedule(sc);
				break;
			case 4:
				this.wordSearch(sc);
				break;
			case 5:
				this.allSchedule();
				break;
			}
		}

	}

	// ���� �޴� ����
	// -> 1. ���� ���� 2. Ư�� �� ���� 3. Ư�� �� ���� 4. Ư�� �ܾ� ���� ���� 5. ��ü ���� 6. ����

	// private method
	// 1. ���� ���� �޴� �޼ҵ�
	private void todaySchedule() {

		String value = LocalDate.now().toString();

		this.print(this.scheduleSearch("today", value));
	}

	// private method
	// 2. Ư�� �� ���� �޼ҵ�
	private void daySchedule(Scanner sc) {

		System.out.print("Ư���� (YYYY-MM-DD)? ");
		String value = sc.nextLine();

		// �˻� ���� �޼ҵ� ȣ��
		// null �� ���� �纻 �迭 ��ȯ
		// ->��� ���� �޼ҵ� ȣ��
		this.print(this.scheduleSearch("day", value));

	}

	// private method
	// 3. Ư�� �� ���� �޼ҵ�
	private void monthSchedule(Scanner sc) {
		System.out.print("Ư���� (YYYY-MM)? ");
		String value = sc.nextLine();

		// �˻� ���� �޼ҵ� ȣ��
		// null �� ���� �纻 �迭 ��ȯ
		// ->��� ���� �޼ҵ� ȣ��
		this.print(this.scheduleSearch("month", value));
	}

	// private method
	// 4. Ư�� �ܾ� ���� �޼ҵ�
	private void wordSearch(Scanner sc) {
		System.out.print("ã�����ϴ� �˻� �ܾ �Է��ϼ���. >  ");
		String value = sc.nextLine();
		
		this.print(this.scheduleSearch("content", value));
	}

	// private method
	// 5. ��ü ���� �޼ҵ�
	private void allSchedule() {
		// ��½� ���� ������ ��¥������ ���ĵ� ���·� ��µǵ��� �Ѵ�.
		/*
		 * this.idx�� null���� ������� ��� ��Ȯ���� ���� �� �־ count�� ������ �ٽ� �����ִ� ���� ����. int count =
		 * 0; for (Schedule s : schedule){ if( s != null) ++count; }
		 */

		// null ���� ������ ���� ������ ����ִ� �纻 �迭 �����.
		Schedule[] sch = new Schedule[this.idx];
		int i = 0;
		for (Schedule s : this.scheduleArray) {
			if (s != null) {
				sch[i] = s;
				++i;
			}
		}

		// ��� ���� �޼ҵ� ȣ�� -> print()
		this.print(sch);
	}

	// private method
	// -> ���� + ��� �׼� �޼ҵ�
	// -> null ���� ���� �迭�� �ܺο��� ���� �޴´�.
	private void print(Schedule[] allSchedule) {

		System.out.println("======================================================");
		System.out.println("��ȣ		��¥	    ����");
		System.out.println("======================================================");

		// ���� �׼� �߰�
		Arrays.sort(allSchedule);

		// ��� �׼�
		int count = allSchedule.length;
		for (Schedule s : allSchedule) {
			System.out.println(s.toString());
		}

		System.out.println("------------------------------------------------------");
		System.out.println("�� " + count + "��");

	}

	// �迭 �����
	private void extendArray(Schedule[] schedule) {

		schedule = Arrays.copyOf(schedule, schedule.length + 10);

		this.scheduleArray = schedule;

		System.out.println();
		System.out.println("*****************  ��    ��  *****************");
		System.out.println("�迭 ����� �ʰ�. �ڵ����� 10�� ������ŵ�ϴ�.");
		System.out.println("**********************************************");
		System.out.println();

	}

	// private method
	// -> �˻� ���� �޼ҵ�
	// -> �˻� ������ �Ű� ������ String key, String value�� ����
	private Schedule[] scheduleSearch(String key, String value) {

		// key -> �˻� ����, ���� ���, "Ư����"
		// value -> �˻� �ܾ�. ���� ��� "2018-07-19"
		// �˻� ����� null �� ����

		// �˻� ��� ����� �ӽ� �迭 �غ�
		Schedule[] scheduleList = new Schedule[this.idx];

		int a = 0;
		
		// �迭 ����ҿ� �ִ� ���� ������ �˻��ϱ� ���� �ݺ���
		for(Schedule s : this.scheduleArray) {
			if(s != null) {
				//�˻� ����(key)�� �˻� �ܾ�(value)�� �´� ����
				//�ӽ� �迭�� ����
				String temp = null;
				if(key.equals("today") || key.equals("day") || key.equals("month")) {
					temp = s.getScheduleDate();
				}
				
				if(key.equals("content")) {
					temp = s.getScheduleContent();
				}
				
				if(temp.contains(value)) {
					scheduleList[a] = s;
					++a;
				}
			}
		}

		return Arrays.copyOfRange(scheduleList, 0, a);
	}
}
