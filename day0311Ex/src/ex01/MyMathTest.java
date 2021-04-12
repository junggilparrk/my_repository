package ex01;

public class MyMathTest {
	public static void main(String[] args) {
	MyMath m=new MyMath();
	
	int result=m.sum(5, 20);
	System.out.println("두자리 정수의 합은"+result);
	
	int result1=m.sum(30, 15, 100);
	m.printSum(3, 4, 5);

	
	double result2=m.sum(5.555, 6.666);
	System.out.println("2자리 실수의 합"+result2);
	
	int result3=m.sub(10, 4);
	System.out.println("두자리 정수의 차="+result3);
	
	int result4=m.mul(10, 3);
	System.out.println("두자리 정수의 곱="+result4);
	
	int Result=m.sum(result, result1);
	
	int result5=m.div(Result, 5);
	System.out.println("편균="+result5);
	m.printSum(result, result1);
	
	//int tot=m.sum(m.sum(5,20),m.sum(30,15,100))도 가능
	
	}
}
