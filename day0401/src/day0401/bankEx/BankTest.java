package day0401.bankEx;

public class BankTest {
	static BankAccount account=new BankAccount();
	
	public static void main(String[] args) {
		Thread t1= new Thread(new User(account));
		Thread t2= new Thread(new User(account));
		t1.start();
		t2.start();
	}

}
