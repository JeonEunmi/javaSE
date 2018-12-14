package com.test003;

public class Main {

	public static void main(String[] args) {
		
		//Car 클래스에 대한 객체(instance) 생성
		Car c = new Car();
		
		//Car 객체의 멤버(field) 접근(읽기)
		// .(dot) 연산자 - 객체의 하위 멤버(공개된 멤버) 접근
		// 참조 자료형만 가지고 있는 고유한 특성
		System.out.println(c.model);
		System.out.println(c.company);
		System.out.println(c.color);
		
		//Car 객체의 멤버(field) 직접 접근(쓰기) -> 권장하지 않는 방법
		//권장방법 : 캡슐화
		c.model = "뉴그랜저";
		System.out.println(c.model);
		
		//동일한 클래스를 이용해서 여러개의 객체(insatance) 생성
		//->현재는 동일한 상태값을 가진 객체
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.model = "모닝";
		System.out.println(c1.model);
		System.out.println(c2.model);
	}

}
