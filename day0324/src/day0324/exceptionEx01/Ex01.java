package day0324.exceptionEx01;

public class Ex01 {
	public static void main(String[] args) {
		//(예외 excpetuon)
		int x=1;
		int y=0;
		int z =x/y;
		System.out.println("x/y:"+z);
		//java.lang.ArithmeticException 수학과 관련된 예외(0으로 나누면 옆처럼 뜸) / by zero 로
	}
}
