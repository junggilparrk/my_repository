package day0324.exceptionEx02;

public class ThrowException {
	public static void main(String[] args) {
		//예외는 오류상황이 발생할 때 생기는것입.
		//이 예외를 직접 만들수도 있다.
		int x=1;
		int y=0;
		//System.out.println(x/y);
		throw new ArithmeticException();//예외가 발생
		//System.out.println("실행종료");
		
	}
}
