package interfaveEx02;

public class DanggnTest {
	public static void main(String[] args) {
		DanngnUser user= new DanngnUser();
		//Buy,Sell을 상속했기 때문에
		//user는 반드시 buy와 sell이라는 메서드가 있다는 것을 알수 있음.
		user.buy();
		user.sell();
		
		Buy b=user;
		b.buy();
		Sell s=user;
		s.sell();
	}
}
