package day0324Ex;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int i=sc.nextInt();
		if(i==3) {
			try {
				throw new MyException();
				
			}catch(MyException e) {
				e.printStackTrace();
				System.out.println("숫자3은 안됩니다.");
				
			}
		}
	}

}
 