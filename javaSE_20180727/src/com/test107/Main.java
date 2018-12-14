package com.test107;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		// Class Ŭ����
		// -> Ŭ������ ��Ÿ ������ �м� -> ���÷���
		
		try {
			Class cl = Class.forName("java.lang.String");
			
			 System.out.println("Ŭ�����̸� : " + cl.getName());
			 
			 // ������ ����
			 System.out.println("������ ���� ----------");
			 
			 Constructor[] constructors = cl.getDeclaredConstructors();
			 for(Constructor con : constructors) {
				 System.out.println(con.getName());
				 Class[] parameters = con.getParameterTypes();
				 for(Class c: parameters) {
					 System.out.println(c.getName());
				 }
				 System.out.println("----------");
			 }
			 
			 // �ʵ� ����
			 System.out.println("�ʵ� ���� -----------");
			 Field[] fields = cl.getDeclaredFields();
			 
			 // �޼ҵ� ����
			 System.out.println("�޼ҵ� ���� -----------");
			 Method[] methods = cl.getDeclaredMethods();
			 
			 // newInstance() �޼ҵ带 �̿��� ���� ��ü ����
			 // ->new ������ ���� ��ü ���� ����
			 // ->Object �ڷ������� ��ȯ
			 
			 try {
				Object obj = cl.newInstance();
				
				System.out.println("��ü���� : "  + obj.toString());
				
				System.out.println("String ��ü Ȯ�� : " + (obj instanceof String));
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			 
			 
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
