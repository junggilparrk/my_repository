package day0316Ex.ex01;

public class UserTest {
	public static void main(String[] args) {
		User u=new User("홍길동","gogossing","password",1000);
		u.setPoint(2000);
		System.out.println(u.getPoint());
		System.out.println(u);

	}
}
 