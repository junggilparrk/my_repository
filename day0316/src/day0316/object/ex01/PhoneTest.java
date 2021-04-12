package day0316.object.ex01;

public class PhoneTest {
	public static void main(String[] args) {
		Phone phone=new Phone("아이폰");
		Phone phone1=new Phone("갤럭시");
		phone.call();
		Person person= new Person();
		person.doCall(phone1);
		
	}
}
 