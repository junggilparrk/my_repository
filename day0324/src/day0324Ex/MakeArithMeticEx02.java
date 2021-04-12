package day0324Ex;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class MakeArithMeticEx02 {

	public static void main(String[] args) {
		//1. 사용자로부터 숫자를 입력받아 ArithMeticException을 발생시키는 코드를 만들고
		//	 if-else문을 이용하여 회피하는 코드를 추가하시오.
		//2. MakeArithMeticEx02 위 코드를 try-catch 방식으로 처리하도록 작성
		//	 cast예외가 발생하는 상황을 만들고 try-catch 방식으로 처리하도록 작성 
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int a=sc.nextInt();
		System.out.println("숫자를 입력해 주세요");
		int b=sc.nextInt();
		int c=0;
		try {
				c=a/b;
			System.out.println(c);
		}catch(ArithmeticException ar) {
			System.out.println("나누기 값은 0으로 나눌수 없습니다.");
		}
		
	}
}
