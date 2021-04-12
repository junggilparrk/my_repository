package day0319.genericEx02;

public class StoreTest {
	public static void main(String[] args) {
		//<Integer> 이 store는 Integer만 담을 수 있는 객체로 사용하겠다.
		Store <Integer> store=new Store <Integer>();
		
		store.setData(new Integer(100));
		
		//String str= (String)store.getData();//컴파일 하면서 잘못된 부분을 판단 할 수 있음.
		System.out.println(store.getData());
	}
}
