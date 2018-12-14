package com.test;

// 실세계의 보드마카 (state, behavior)에 대한 소프트웨어
// -> BoardMarker Class

public class RedBoardMarker {
	
		//state -> color, ... ->field
		private String color = "Red";

		//behavior -> writing(매개변수) -> method
		public void writing(String msg) {
			// 액션코드 
			System.out.println(color + " : " + msg);
		}
	}

