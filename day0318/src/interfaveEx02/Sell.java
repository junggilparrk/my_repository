package interfaveEx02;

public interface Sell {
	void sell();
	
	void printInfo();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
