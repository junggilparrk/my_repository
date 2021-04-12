package day0312Ex;

public class CalcTest {
	public static void main(String[] args) {
		MyCalc c=new MyCalc();
		Calc a= new Calc();
		System.out.println("두 정수의 합은: "+a.sum(3,2)+", 두 정수의 차: "+a.sub(4,5));
		System.out.println("두 정수의 합은: "+c.sum(3,2)+", 두 정수의 차: "+c.sub(4,5)+", 두 정수의 곱: "+c.mul(6,7)+", 두 정수의 나누기: "+c.div(30,4));		
		
	}
}
