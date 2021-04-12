package day0322.listEx02;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex02 {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		
		String[]foods=new String[5];
		foods[0]="육회";
		foods[1]="생간과 천엽";
		foods[2]="삼겹살";
		foods[3]="구복만두";
		foods[4]="김밥";
		//리스트로 변경;
		System.out.println();
		List foodList=Arrays.asList(foods);
		
		System.out.println(foodList);
		ArrayList<String> li=new ArrayList<String>(foodList);
		li.add("순대국");
		System.out.println(li);
	}
}
