package com.grade02;

import java.util.Arrays;

// �ڷ� ����� � Ŭ����
public class GradeList {

	// (�迭) �ڷ� ����� ���� -> field
	private Grade[] gradeList = new Grade[10];

	// �ε��� ������ ����
	private int idx;

	// ������ -> �ʱ�ȭ
	public GradeList() {
		this.gradeList[this.idx] = new Grade("G001", "HONG", 86, 91, 43);
		++this.idx;
		this.gradeList[this.idx] = new Grade("G002", "PARK", 100, 56, 84);
		++this.idx;
		this.gradeList[this.idx] = new Grade("G003", "CHOI", 75, 71, 83);
		++this.idx;
		this.gradeList[this.idx] = new Grade("G004", "MIN", 82, 96, 69);
		++this.idx;
		
		this.gradeRank();
	}
	
	// ��ȣ �ڵ� ���� �޼ҵ�
	public String autoGid() {
		
		String result = "";
		result = String.format("G%03d", (this.idx+1));
		return result;
		
	}

	// ���� �Է� �׼� �޼ҵ�
	public void gradeAdd(Grade gradeList) {
		
		this.gradeList[this.idx] = gradeList;
		++this.idx;

		//����) �����Է� �� ���� ��� ����� �ʿ�
		this.gradeRank();
	}

	// ���� ��� �׼� �޼ҵ�
	public Grade[] gradeList() {

		Grade[] result = new Grade[this.idx];

		// �ڷ� ����ҿ��� null ���� ������ �ڷḸ ������ �纻 �迭 ���� �� ��ȯ
		int i = 0;

		for (Grade g : gradeList) {
			if (g != null) {
				result[i] = g;
				++i;
			}

		}
		return result;
	}

	// ���� �˻� �׼� �޼ҵ� -> String key, String value
	public Grade[] gradeSearch(String key, String value) {
	
		// 1. �ܺο��� ���޹��� key, value�� ������ �˻� ����
		// 2. key ������ ���� ���� �پ��� �������� �˻�
		// 3. value ������ �˻��ϰ����ϴ� ���̴�.
		// 4. �˻� ����� �纻 �迭 ���� �� ��ȯ. null �� ���ܵ� �迭.
		
		Grade[] tmp = new Grade[this.idx];
		int a = 0;
		for (Grade g : this.gradeList) {
			if(g != null) {
				String temp = null;
				if(key.contains("gid")) {
					temp = g.getGid();
				}
				if(key.contains("name")) {
					temp = g.getName();
				}
				if(temp.contains(value)) {
					tmp[a] = g;
					++a;
				}
			}
		}
		
		return Arrays.copyOfRange(tmp, 0, a);

	}

	// ���� ��� �޼ҵ� -> private method
	private void gradeRank() {
		
		// 1. ���� �ʱⰪ 1�� ����
		// 2. ���� ������ ���� ���� �� �׼� -> ��ø�� for��
		// 3. ���� ������ ���� ��� ���� ����� +1 ����
		// 4. ���� ���� ������ setter�� �̿��ؼ� ����
		//����) null �� �� ����
		
		for(int i = 0; i < this.gradeList.length; ++i) {
			Grade g = this.gradeList[i];
			if(g != null) {
				g.setRank(1);				
			}
		}
		
		for(int i = 0; i < this.gradeList.length; ++i) {
				Grade g = this.gradeList[i];
				if(g != null) {
					for(int j = 0; j < this.gradeList.length; ++j) {
						Grade g2 = this.gradeList[j];
						if(g2 != null) {
							if(g.getTotalSum() < g2.getTotalSum()) {
								g.setRank(g.getRank() + 1);
							
							}
						}
					}		
				}
		}
	}
}
