package com.test087;

// 여러개의 인터페이스를 하나의 인터페이스로 통합
// -> 인터페이스 상속 기능 이용
// -> 다중 상속 허용
public interface Super extends Super1, Super2 {
	
	// 멤버 구성 없다
	// Super1, Super2 인터페이스의 멤버 사용
	// -> method1(), method2() 통합 관리
	

}
