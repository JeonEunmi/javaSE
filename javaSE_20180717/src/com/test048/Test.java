package com.test048;

public class Test {

	// static final 키워드
	// -> 초기화 이후 상태값 변경(setter) 불가한 변수 선언시 사용
	// -> 읽기 전용 (getter)
	// -> 접근 제한자는 public 사용
	// -> 필드명은 대문자 사용
	// -> "상수(constants)" 로 호칭
	// -> static 이기 때문에 자동, 명시적 초기화 가능
	
	// 각 개체(instance)마다 독립적으로 가져야할 전용 자료
	private String name; // "hong" or "park"
	// 읽기 전용 자료
	public static final String DEPT = "쌍용교육센터";
	
	// (instance) getter
	public String getName() {
		return this.name;
	}
		
	// (instance) setter
	// -> 객체의 상태값 수정 시 사용한다.
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	// (static) getter
	public String getDept() {
		return this.dept;
}
	
	//(instance) setter
	public void setDept(String dept) {
		//final field -> 수정 불가
		this.dept = dept;
	}
	*/
}
