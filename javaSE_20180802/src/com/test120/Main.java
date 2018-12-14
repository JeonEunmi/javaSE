package com.test120;

import java.util.*;

public class Main {

   public static void main(String args[]) {
      // create an array list
      ArrayList<String> al = new ArrayList<String>();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");       // 인덱스를 지정하지 않아 뒤에서부터 추가
      al.add(1, "A2");   // 인덱스를 이용한 추가
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F"); // 자료를 이용한 삭제
      al.remove(2);   // 인덱스를 이용한 삭제
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      
      System.out.println("==========");
      // 반복문에 의한 컬렉션 엘리먼트 검색
      for(int i = 0; i < al.size(); i++) {
    	  System.out.println(al.get(i));
      }
      System.out.println("==========");
      for(String name : al) {
    	  System.out.println(name);
      }
      
      // List 컬렉션 자료 정렬 (Set이나 Map 은 정렬 불가)
      Collections.sort(al, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
    	  
	});
      System.out.println("Contents of al: " + al);
   }
}