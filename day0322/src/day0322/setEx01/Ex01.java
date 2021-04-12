package day0322.setEx01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//중복이 없다.특정 아이를 꺼낼 수 없다.
		Set<Integer> myNumber=new HashSet<Integer>();
		myNumber.add(10);
		myNumber.add(45);
		myNumber.add(20);
		myNumber.add(30);
		myNumber.add(11);
		myNumber.add(3);
		
		//[10,45,20,30,11,3]
		//get이라는 메서드를 갖고 있지 않다.
		//하나씩 전부 꺼내야함.
		//Iterator는 하나씩 접근해 주는 아이
		Iterator<Integer> it=myNumber.iterator();
		//it.hasNext(); 안에 남은게 있는가?
		//it.next() : 하나를 꺼냄
		while(it.hasNext()) {
			System.out.println("숫자:"+it.next());
		}
		System.out.println("------------------------------------");
		//for문으로도 가능
		for(Integer i : myNumber) {
			System.out.println("i:"+i);
		}
		//같은 번호를 추가해도 추가되지 않는다.
		myNumber.add(10);
		System.out.println(myNumber);
		
		
	}
}
