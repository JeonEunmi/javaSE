package com.schedule01;

import java.util.Arrays;

// ����� �
public class ScheduleList {

	// �ʵ� ���� -> �迭 ����� �
	private Schedule[] scheduleArray = new Schedule[10];

	private int idx;

	// ������ -> �ʵ� �ʱ�ȭ
	public ScheduleList() {
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

	// ��ȣ �ڵ� ���� �޼ҵ�
	public String autoGid() {

		String result = "";
		result = String.format("S%03d", (this.idx + 1));
		return result;

	}

	// ������ �Է�
	public int scheduleAdd(Schedule schedule) {
		int a = 0;
		
		scheduleArray[this.idx] = schedule;
		++this.idx;

		if (this.scheduleArray.length == this.idx) {
			this.extendArray();
			a = 1;
		}
		
		return a;
	}

	// ��� �޼ҵ�
	public Schedule[] allSchedule() {

		Schedule[] sch = new Schedule[this.idx];
		int i = 0;
		for (Schedule s : this.scheduleArray) {
			if (s != null) {
				sch[i] = s;
				++i;
			}
		}

		return sch;

	}

	// �迭 �����
	public void extendArray() {

		Schedule[] schedule = Arrays.copyOf(scheduleArray, scheduleArray.length + 10);

		this.scheduleArray = schedule;

	}

	// private method
	// -> �˻� ���� �޼ҵ�
	// -> �˻� ������ �Ű� ������ String key, String value�� ����
	public Schedule[] scheduleSearch(String key, String value) {

		// key -> �˻� ����, ���� ���, "Ư����"
		// value -> �˻� �ܾ�. ���� ��� "2018-07-19"
		// �˻� ����� null �� ����

		// �˻� ��� ����� �ӽ� �迭 �غ�
		Schedule[] scheduleList = new Schedule[this.idx];

		int a = 0;

		// �迭 ����ҿ� �ִ� ���� ������ �˻��ϱ� ���� �ݺ���
		for (Schedule s : this.scheduleArray) {
			if (s != null) {
				// �˻� ����(key)�� �˻� �ܾ�(value)�� �´� ����
				// �ӽ� �迭�� ����
				String temp = null;
				if (key.equals("today") || key.equals("day") || key.equals("month")) {
					temp = s.getScheduleDate();
				}

				if (key.equals("content")) {
					temp = s.getScheduleContent();
				}

				if (temp.contains(value)) {
					scheduleList[a] = s;
					++a;
				}
			}
		}

		return Arrays.copyOfRange(scheduleList, 0, a);
	}

}
