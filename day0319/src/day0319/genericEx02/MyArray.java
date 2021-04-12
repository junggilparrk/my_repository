package day0319.genericEx02;
//제네릭은 배열로도 만들 수 있다.
public class MyArray <T>{
	private T[] arr;
	
	public MyArray() {
		//배열은 Object로 먼저 생성 후 형변환 하는 방법으로 만들어야한다.
		arr= (T[]) new Object[10];
	}
	
	public void add(T t,int index) {
		if(index < arr.length && index>=0) {
		arr[index]=t;
		}else {
			System.out.println(index+"는 배열의 크기를 벗어나 추가되지 않습니다.");
		}
		 
	}
}
