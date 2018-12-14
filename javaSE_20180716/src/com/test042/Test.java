package com.test042;

public class Test {

	// static 키워드
	// -> 정적 멤버(field, method) 구성시 사용하는 키워드
	// 예를 들어,
	// private static int a = 0;
	// public static void method() { //실행코드}

	// ->정적 멤버는 프로그램 실행시 인스턴스 보다 먼저 로딩된 상태이다.
	// 나중에 인스턴스 멤버가 메모리에 적재되면 정적 멤버는 이미 로딩된 상태로 보인다.
	// 언제든지 접근 가능한 상태이다.
	// ->모든 인스턴스 멤버는 정적 멤버를 공유하게 된다.
	// 예를 들어, 인스턴스인 name 변수는 각각의 인스턴스가 전용 공간을 가진다.
	// 반면 정적멤버인 dept 변수의 "쌍용교육센터"는 공유된다.
	// -> 정적 멤버는 생성자가 없다. getter, setter만 사용 가능
	// -> 인스턴스 멤버는 생상자, getter, setter 모두 사용 가능

	private String name; // "홍길동", "박자바", ... 를 개별 저장
	private static String dept = "쌍용교육센터"; // 공용 사용인 정적멤버

	// 기본 생성자
	public Test() {

	}

	// 매개변수 있는 생성자 (인스턴스 메소드)
	// ->객체 생성시에 한 번만 호출 가능
	public Test(String name) {
		// this 키워드는 인스턴스 메소드 내에서만 사용 가능
		this.name = name;
	}
	
	// (instance) getter
	// -> 취급하는 멤버(field)가 instance이다.
	public String getName() {
		return this.name;
	}
	
	// (instance) setter
	// -> 객체의 상태값 수정 시 사용한다.
	public void setName(String name) {
		this.name = name;
	}
	
	// (static) getter
	public static String getDept() {
		// 정적 멤버 접근 시 클래스명.멤버명 형태로 작성
		// Test. 은 생략가능하지만, 로컬 변수와 충돌 가능성이 있어 권장하지 않는다.
		return Test.dept;
	}
	/* 정적 setter를 만들 수는 있지만, static은 수정 불가하므로 읽기전용으로 getter만 생성
	// (static) setter
	public static void setDept(String dept) {
		Test.dept = dept;
	}
	*/
}
