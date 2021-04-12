package day0316.object.ex01;

public class StudentTest {

	public static void main(String[] args) {
		Student st01=new Student();
		Student st02=new Student();
		st01.setName("가렌");
		
		System.out.println(st01.getName());
		
		System.out.println(st01);
		System.out.println(Integer.toHexString(st01.hashCode()));

		//object안에 있는 메서드 equals()는
		//두개의 객체의 헤시코드를 비교하는 메서드이다.
		System.out.println(st02);
		System.out.println(st01.equals(st02));
		System.out.println(st01==st02);
		
		String st01Str=st01.toString();
		System.out.println("st01.toString(): "+st01.toString());
		//해당 객체를 문자열로 변경
		//st01==st01.toStirng//st01실행시 toStirng을 자동으로 실행	
	}

}
 