package interfaveEx02;

public interface Buy {
	void buy();
	
	void printInfo();
	
	default void order() {
		System.out.println("구매 주문");
	}
}
