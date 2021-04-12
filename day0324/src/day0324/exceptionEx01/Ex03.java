package day0324.exceptionEx01;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * //try-catch 
		 * try { //예외가 발생할 것 같은 코드 } 
		 * catch(처리할 예외의 타입){ //예외가 발생했을 때 실행 할
		 * 코드; }
		 */
		int x=1;
		int y=0;
		int z;
		try {
			z=x/y;
		}catch(ArithmeticException e) {//if-else랑 비슷함 그래서 catch 부분에 기재시 try에서 실행이 되지 않을 경우 catch에서 실행 try가 실행 될 경우 catch가 미 실행
			System.out.println("0으로 나누기를 해서 문제가 된다.");
			z=-1;
		}
		System.out.println("x/y는"+z);
	}
}
