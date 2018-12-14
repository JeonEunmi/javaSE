package com.test;
 
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        // Member ��ü�� ������ ����� List �÷��� �غ�
        List<Member> list = new ArrayList<Member>();
 
        list.add(new Member("���ڹ�", "7890"));
        list.add(new Member("ȫ�浿", "4567"));
        list.add(new Member("�ڼ���", "1234"));
        list.add(new Member("ȫ�浿", "1234"));
        System.out.println("===================");
 
        System.out.println("��ü��� : " + list.toString()); // [ �̸�, ��ȭ��ȣ, ...]
 
        // ��ȭ��ȣ ���� �˻� ����
        String phone = "ȫ�浿";
 
        List<Member> tmp = new ArrayList<Member>();
        for (Member m : list) {
            if (m.getName().equals(phone)) {
                tmp.add(m);
            }
        }
        if (tmp.size() == 0) {
            System.out.println("��� ����� �����ϴ�.");
        } else {
            System.out.println("������ ��� : " + tmp.toString());
        }
 
        // ��ȭ��ȣ ���� ���� ����
 
        while(true) {
            Member temp = null;
            
            for (Member m : list) {
                if (m.getName().equals(phone)) {
                    temp = m;
                }
            }
            list.remove(temp);    
            
            if(temp == null) {
                break;
            }
            
        }
        System.out.println("===================");
        System.out.printf("%d���� �����Ǿ����ϴ�%n", tmp.size());
 
 
        System.out.println(list.toString());
    }
}