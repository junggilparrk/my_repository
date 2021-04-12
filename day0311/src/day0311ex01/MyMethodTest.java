package day0311ex01;

public class MyMethodTest {

	public static void main(String[] args) {
		//1=5까지수를 출력하는 코드를 출력하라.
		MyMethod me1=new MyMethod();
		me1.printNuber();
		
		me1.printName("안녕하세요");
		me1.printNum(100);
		me1.sumNumbers(5, 4, 3);
		me1.printSomething("문자열", 1, 1.0);
		int result=me1.sum(10, 20);
		System.out.println(result);
		System.out.println(result/2);
		
	
		
	}

}
