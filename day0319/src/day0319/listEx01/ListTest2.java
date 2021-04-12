package day0319.listEx01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class ListTest2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("7개의 숫자를 넣어주세요");
		for(int i=0;i<7;i++) {
		int n=sc.nextInt();
		}
	int[] numbers=new int[8];
		/*
		 * numbers[0]=1; numbers[1]=5; numbers[2]=10; numbers[3]=15; numbers[4]=20;
		 * numbers[5]=30; numbers[6]=40;
		 */
	System.out.println(numbers[4]);
		/*
		 * numbers[7]=numbers[6]; numbers[6]=numbers[5]; numbers[5]=numbers[4];
		 * numbers[4]=numbers[3]; numbers[3]=numbers[2];
		 */
	for(int i=7;i>2;i--) {
		numbers[i]=numbers[i-1];
	}
	numbers[2]=100;
	System.out.println(numbers[6]);
	numbers[4]=2;
	System.out.println(Arrays.toString(numbers));
	
	System.out.println();
	
	ArrayList<String> habby=new ArrayList<>();
	habby.add("노래");
	habby.add("게임");
	habby.add("술");
	System.out.println(habby);
	habby.set(1,"공부");
	habby.add(1,"코딩");
	System.out.println("ArrayList 크기: "+habby.size()+", ArrayList 내용:"+habby);
	System.out.println(habby.get(0));
	habby.remove(1);
	for(int i=1;i<3;i++) {
		System.out.print(habby.get(i)+" ");
	}
	
	

	
	
	
	}

}
