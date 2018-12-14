package com.test107;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		// Class 클래스
		// -> 클래스의 메타 데이터 분석 -> 리플렉션
		
		try {
			Class cl = Class.forName("java.lang.String");
			
			 System.out.println("클래스이름 : " + cl.getName());
			 
			 // 생성자 정보
			 System.out.println("생성자 정보 ----------");
			 
			 Constructor[] constructors = cl.getDeclaredConstructors();
			 for(Constructor con : constructors) {
				 System.out.println(con.getName());
				 Class[] parameters = con.getParameterTypes();
				 for(Class c: parameters) {
					 System.out.println(c.getName());
				 }
				 System.out.println("----------");
			 }
			 
			 // 필드 정보
			 System.out.println("필드 정보 -----------");
			 Field[] fields = cl.getDeclaredFields();
			 
			 // 메소드 정보
			 System.out.println("메소드 정보 -----------");
			 Method[] methods = cl.getDeclaredMethods();
			 
			 // newInstance() 메소드를 이용한 동적 객체 생성
			 // ->new 연산자 없이 객체 생성 가능
			 // ->Object 자료형으로 반환
			 
			 try {
				Object obj = cl.newInstance();
				
				System.out.println("객체정보 : "  + obj.toString());
				
				System.out.println("String 객체 확인 : " + (obj instanceof String));
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			 
			 
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
