package day0401.bankEx;

public class User implements Runnable {

	BankAccount account;
	
	
	public User(BankAccount account) {
		this.account=account;
	}
	
	@Override
	public void run() {
		//100번을 입금, 출금 하기
		for(int i=0;i<100;i++) {
			account.depsit(10000);
			try {
				Thread.sleep(99);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withraw(10000);
			System.out.println("잔고: "+account.getBlance());
		}
	} 

}
