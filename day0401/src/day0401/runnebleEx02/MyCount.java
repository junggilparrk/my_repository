package day0401.runnebleEx02;

public class MyCount implements MyRunnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		 
	}

}
