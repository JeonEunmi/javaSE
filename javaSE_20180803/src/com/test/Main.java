package com.test;
 
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        // Member 객체가 여러개 저장된 List 컬렉션 준비
        List<Member> list = new ArrayList<Member>();
 
        list.add(new Member("김자바", "7890"));
        list.add(new Member("홍길동", "4567"));
        list.add(new Member("박수연", "1234"));
        list.add(new Member("홍길동", "1234"));
        System.out.println("===================");
 
        System.out.println("전체멤버 : " + list.toString()); // [ 이름, 전화번호, ...]
 
        // 전화번호 기준 검색 진행
        String phone = "홍길동";
 
        List<Member> tmp = new ArrayList<Member>();
        for (Member m : list) {
            if (m.getName().equals(phone)) {
                tmp.add(m);
            }
        }
        if (tmp.size() == 0) {
            System.out.println("출력 대상이 없습니다.");
        } else {
            System.out.println("삭제될 대상 : " + tmp.toString());
        }
 
        // 전화번호 기준 삭제 진행
 
        while(true) {
            Member temp = null;
            
            for (Member m : list) {
                if (m.getName().equals(phone)) {
                    temp = m;
                }
            }
            list.remove(temp);    
            
            if(temp == null) {
                break;
            }
            
        }
        System.out.println("===================");
        System.out.printf("%d건이 삭제되었습니다%n", tmp.size());
 
 
        System.out.println(list.toString());
    }
}