package day0319.genericEx02;

// 제네릭으로 타입을 고정하는 방법
public class Store<T> {//타입을 이 클래스를 이용해서 객체를 만들때 정하도록 하는 방식
	private T data;
	public void setData(T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	
}
