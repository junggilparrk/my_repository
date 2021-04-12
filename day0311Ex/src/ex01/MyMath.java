package ex01;

public class MyMath {
	//두수의 합을 출력하는 printSum()메서드
	//두 정수의 합을 반환하는 sum()메서드
	//세 정수의 합을 출력하는 printSum()메서드
	//세 정수의 합을 반환하는 sum()메서드
	//두 실수의 합을 출력하는 printSum()메서드
	//두 실수의 합을 반환하는 sum()메서드
	//두 정수의 차를 반환하는 sub()메서드
	//두 정수의 곱을 반환하는 mul()메서드
	//두 정수의 나누기를 반환하는 div()메서드
	
	//
	
	void printSum(int a, int b) {
		System.out.println("5자리 숫자의 합= "+(a+b));
	}
	
	int sum(int a,int b) {
		int s=a+b;
		return s;
	}
	
	void printSum(int a, int b,int c) {
		System.out.println("세자리 정수의 합= "+(a+b+c));
	}
	
	int sum(int a,int b,int c) {
		int s=a+b+c;
		return s;
	}

	void printSum(double a,double b) {
		System.out.println("result2= "+(a+b));
	}
	
	double sum(double a, double b) {
		double s= a+b;
		return s;
	}
	int sub(int a,int b) {
		int s=a-b;
		return s;
	}
	
	int mul(int a,int b) {
		int s=a*b;
		return s;
	}
	
	int div(int a,int b) {
		int s=a/b;
		return s;
	}
	
	
	
	
}
