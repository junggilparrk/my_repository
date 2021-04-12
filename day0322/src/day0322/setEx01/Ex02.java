package day0322.setEx01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//음식5가지를 담을 수 있는 Set을 만들고 출력
		Set<String> f=new HashSet<String>();
		f.add("삼겹살");
		f.add("떡볶이");
		f.add("소곱창");
		f.add("족발");
		f.add("야채 곱창");
		
		Iterator<String> i=f.iterator();
		while(i.hasNext()){
			System.out.println("음식 리스트:"+i.next());
		}
		f.remove("떡볶이");
		
		System.out.println("******************************************");
		for(String s:f) {
			System.out.println("음식리스트:"+s);
		}
		
		int sum=0;
		int temp=0;
		int sum1=0;
		int temp1=0;
		Set <Integer> n=new HashSet<Integer>();
		n.add(1);
		n.add(3);
		n.add(6);
		n.add(12);
		n.add(15);
		Iterator<Integer> i1=n.iterator();
		while(i1.hasNext()) {
			temp=i1.next()*2;
			sum+=temp;
		} 
		System.out.println("다섯자리 수의 합 *2:"+sum);
		
		for(Integer in:n) {
			temp1=in*2;
			sum1+=temp1;		
		}
		System.out.println(sum1);
	
		Set<Integer>numberSet=new TreeSet<Integer>();
		numberSet.add(10);
		numberSet.add(15);
		numberSet.add(7);
		numberSet.add(1);
		numberSet.add(30);
		System.out.println(numberSet);
		int tot=0;
		for(Integer j:numberSet) {
			System.out.println(j+"");
			tot+=(j*2);
		}
		System.out.println();
		System.out.println(tot);
		
	}
}
