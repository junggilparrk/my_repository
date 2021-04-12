package ex01;

import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		//for, while, do-while
//			int num=0;
//			while(조건식){
// 				실행할 문장
// 				반복 계수의 증감						
//			}
// 			int num=0;
//			while(i<10){
//				System.out.println("안녕하세요");
//				num=num+1;
//				}	
//			//System.out.println(num);(num 값은 10임)		
		/*
		 * String c="안녕하세요"; int i=0; while(i<10) { System.out.println(c); i++; }
		 */
		/*
		 * for(int i=0;i<5;i=i+1) { System.out.println("안녕하세요"); }
		 */
		/*
		 * int i;
		 * 
		 * 
		 * for( i=0;i<5;i++) { System.out.println("안녕하세요"+(i+1)); }
		 * 
		 * i=0; while(i<5) { System.out.println("안녕하세요"+(i+1)); i++; }
		 * 
		 * for( i=0;i<5;i++) { System.out.println("안녕하세요"+(5-i)); }
		 * 
		 * i=0; while(i<5) { System.out.println("안녕하세요"+(5-i)); i++; }
		 * 
		 * for( i=0;i<5;i++) { System.out.println("안녕하세요"+(10-i)); }
		 * 
		 * 
		 * i=0; while(i<5) {
		 * 
		 * System.out.println("안녕하세요"+(10-i)); i++; }
		 * 
		 * 
		 * for( i=0;i<5;i++) { System.out.println("안녕하세요"+((i+1)*3)); }
		 * 
		 * 
		 * i=0; while(i<5) {
		 * 
		 * System.out.println("안녕하세요"+((i+1)*3)); i++; } //변수 추가해서 해도 됨 int n=3;,
		 * n=n+3;//아니면 초기치값을 변경해서 쓸수 있음 i=3,i<16,i=i=3
		 */		
	
		int i,j,k=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num=scan.nextInt();
		for(i=1;i<10;i++) {
			for(j=2;j<num+1;j++){				
				k=i*j;
				System.out.print(j+"*"+i+"="+k+"\t");
			}
			System.out.println();
		}
		
	}
}



