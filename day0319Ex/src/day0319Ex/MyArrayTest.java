package day0319Ex;

public class MyArrayTest {
	public static void main(String[] args) {
		
		Phone p1=new Phone("아이폰", 13000000);
		MyArray<Phone> p=new MyArray<>();
		
		p.add(p1, 0);
		System.out.println(p.getPhone(0));
	
	}
}
  