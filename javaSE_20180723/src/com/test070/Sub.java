package com.test070;

import com.test069.Super;

public class Sub extends Super{

	// Super 클래스의 멤버 중에서 public, protected
	// Overriding -> 접근제한자는 원본과 같거나, 넓게(public) 설정
	
	//protected는 public 으로 넓게 설정 가능
	@Override
	protected void method3() {
		// TODO Auto-generated method stub
		super.method3();
	}

	//원본이 public 인데 오버라이딩 과정에서 protected로 변경 불가
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		super.method4();
	}

	
}
