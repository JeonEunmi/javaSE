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
      al.add("F");       // �ε����� �������� �ʾ� �ڿ������� �߰�
      al.add(1, "A2");   // �ε����� �̿��� �߰�
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F"); // �ڷḦ �̿��� ����
      al.remove(2);   // �ε����� �̿��� ����
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      
      System.out.println("==========");
      // �ݺ����� ���� �÷��� ������Ʈ �˻�
      for(int i = 0; i < al.size(); i++) {
    	  System.out.println(al.get(i));
      }
      System.out.println("==========");
      for(String name : al) {
    	  System.out.println(name);
      }
      
      // List �÷��� �ڷ� ���� (Set�̳� Map �� ���� �Ұ�)
      Collections.sort(al, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
    	  
	});
      System.out.println("Contents of al: " + al);
   }
}