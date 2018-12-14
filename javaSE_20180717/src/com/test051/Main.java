package com.test051;

public class Main {

	public static void main(String[] args) {
	
		Maltese mt = new Maltese();
		
		// 자기 자신의 기능(메소드) 외에
		// 부모 클래스의 기능(메소드)를 사용할 수 있다.
		mt.barking(); //Dog
		mt.eating();  //SmallDog
		mt.sleeping();  //SmallDog
		mt.tagging();  //Maltese
		
	}

}
