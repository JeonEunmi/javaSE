package com.grade02;

import java.util.*;

// ���� �޴��� �׼� Ŭ����
public class SubMain {

	// �ʵ� ���� -> �ڷ� ����� � Ŭ������ ��ü
	private GradeList g = new GradeList();
	
	// 1. ���������Է� �޴� �޼ҵ�
	public void gradeAdd (Scanner sc) {

		System.out.println("------------------------------------------------------");
		System.out.println("             ��   ��   ��   ��   ��   ��              ");
		System.out.println("------------------------------------------------------");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("����1 ���� : ");
		int sub1 = sc.nextInt();
		sc.nextLine();
		System.out.print("����2 ���� : ");
		int sub2 = sc.nextInt();
		sc.nextLine();
		System.out.print("����3 ���� : ");
		int sub3 = sc.nextInt();
		sc.nextLine();		
		String gid = g.autoGid();
		
		Grade tmp = new Grade(gid, name, sub1, sub2, sub3);
		this.g.gradeAdd(tmp);
		System.out.println("���� ���� �Է��� �����߽��ϴ�.");
		
		
	}
	
	// 2. ����������� �޴� �޼ҵ�
	public void gradeList () {
		System.out.println("------------------------------------------------------");
		System.out.println("��ȣ     �̸�    ����1 ����2 ����3  ����  ���   ����");
		System.out.println("------------------------------------------------------");
		
		Grade[] gradeList = this.g.gradeList();
		
		// ���� ��� �߰� -> null�� ���� �迭 �غ�
		Arrays.sort(gradeList, new Comparator<Grade>() {

			@Override
			public int compare(Grade o1, Grade o2) {
				return o1.getGid().compareTo(o2.getGid());
			}
			
		});
		
		int count = gradeList.length;
		for(Grade g : gradeList) {
			//toString() �޼ҵ� ���� ����
				System.out.println(g.toString());				
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("�� : " + count + "��");
		
	}
	
	// 3. ���������˻� �޴� �޼ҵ�
	public void gradeSearch (Scanner sc) {
		boolean flag = true;
		
		while(flag) {
			System.out.println("======================================================");
			System.out.println("1. ��ȣ����  2. �̸�����  3. ����");
			System.out.println("======================================================");
			System.out.print("���� > ");
			
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			switch(selectNo) {
			case 1 : this.gradeSearchGid(sc);
			break;
			case 2 : this.gradeSearchName(sc);
			break;
			case 3 : flag = false;
			}
			
		}
		// ���� �޴� �
		// 1. ��ȣ����  2. �̸�����  3. ����
		
	}
	
	// 1. ��ȣ���� �޴� �޼ҵ� -> private method
	private void gradeSearchGid(Scanner sc) {

		System.out.print("�˻��� ��ȣ�� �Է����ּ���. > ");
		String value = sc.nextLine();
		int count = 0;
		
		Grade[] tmp = g.gradeSearch("gid", value);
		
		System.out.println("------------------------------------------------------");
		System.out.println("��ȣ     �̸�    ����1 ����2 ����3  ����  ���   ����");
		System.out.println("------------------------------------------------------");
		for(Grade g : tmp) {
			if(g != null) {
				System.out.println(g.toString());
				++count;
			} 
		}
		if(count == 0)  {
			System.out.println("�˻������ �����ϴ�.");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("�� " + count + "��");
		System.out.println();
	}
	
	// 2. �̸����� �޴� �޼ҵ� -> private method
	private void gradeSearchName(Scanner sc) {

		System.out.print("�˻��� �̸��� �Է����ּ���. > ");
		String value = sc.nextLine();
		int count = 0;
		
		Grade[] tmp = g.gradeSearch("name", value);
		
		System.out.println("------------------------------------------------------");
		System.out.println("��ȣ     �̸�    ����1 ����2 ����3  ����  ���   ����");
		System.out.println("------------------------------------------------------");
		for(Grade g : tmp) {
			if(g != null) {
				System.out.println(g.toString());
				++count;
			}
		} if(count == 0 ) {
			System.out.println("�˻������ �����ϴ�.");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("�� " + count + "��");
		System.out.println();
		
	}
}
	

