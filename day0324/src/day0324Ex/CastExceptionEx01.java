package day0324Ex;

public class CastExceptionEx01 {
	public static void main(String[] args) {
		Object o= new String("Test");
		
		String str=(String)o;//다운 캐스팅
		try {
			Integer i=(Integer)o;
		}catch(ClassCastException c) {
			System.out.println("캐스트예외발생");
			c.printStackTrace();
		}

	}

}
