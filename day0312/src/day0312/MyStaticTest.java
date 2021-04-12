package day0312;

public class MyStaticTest {
	public static void main(String[] args) {
		
		MyStatic myStaticObj=new MyStatic();
		myStaticObj.noneStaticNum=10;
		myStaticObj.staticNum=50;
		
		System.out.println("noneStaticNum: "+myStaticObj.noneStaticNum);
		System.out.println("staticNum: "+myStaticObj.staticNum);
		System.out.println("--------------------------------------------");
		
		MyStatic myStaticObj1=new MyStatic();
		myStaticObj1.noneStaticNum=20;
		myStaticObj1.staticNum=100;
		
		System.out.println("noneStaticNum: "+myStaticObj.noneStaticNum);
		System.out.println("staticNum: "+myStaticObj.staticNum);
		
		System.out.println("1.nonStaticNum: "+myStaticObj1.noneStaticNum);
		System.out.println("1.StaticNum: "+myStaticObj1.staticNum);
		
		//클래스명. 스태틱 변수
		MyStatic.staticNum=1000;
		MyStatic.printNumbers();
	
	
		//스태틱 변수임
		Math.random();
		
	}
} 
