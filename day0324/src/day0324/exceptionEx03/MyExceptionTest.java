package day0324.exceptionEx03;

public class MyExceptionTest {
	public static void main(String[] args) {
		int num=(int)(Math.random()*2);
		if(num==0) {
			try {
				throw new MyException("하하하하");
			}catch(MyException e) {
				e.getStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println("종료");
	}

}
