package day0319Ex;

public class MyArrayTest1 {
	public static void main(String[] args) {
		
		Phone p1=new Phone("갤럭시",10000000);
		MyArray1<Phone>p=new MyArray1<Phone>(p1);
		
		p.add1(p1);
		
	}
}
