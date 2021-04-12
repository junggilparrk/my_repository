package day0401.bankEx;

public class BankAccount {
	private int balance;
	
	//입금
	public synchronized void depsit(int amount) {
		balance+=amount;
	}
	
	//출금
	public synchronized void withraw(int amount) {
		balance-=amount;
	}
	
	public int getBlance() {
		return balance;
	}
}
