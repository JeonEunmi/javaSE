package com.test047;

public class Test {

	// final 키워드
	// -> 초기화 이후 상태값 변경(setter) 불가한 변수 선언시 사용
	// -> 읽기 전용 (getter)
	// -> instance 이기 때문에 자동, 명시적, 생성자 초기화 가능
	
	// 각 개체(instance)마다 독립적으로 가져야할 전용 자료
	private String name; // "hong" or "park"
	// 읽기 전용 자료
	private final String dept = "쌍용교육센터";
	
	// (instance) getter
	public String getName() {
		return this.name;
	}
		
	// (instance) setter
	// -> 객체의 상태값 수정 시 사용한다.
	public void setName(String name) {
		this.name = name;
	}
	
	// (static) getter
	public String getDept() {
		return this.dept;
}
	/*
	//(instance) setter
	public void setDept(String dept) {
		//final field -> 수정 불가
		this.dept = dept;
	}
	*/
}
