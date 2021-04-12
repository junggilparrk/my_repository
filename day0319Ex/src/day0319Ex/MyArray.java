package day0319Ex;

public class MyArray <T>{
	private T[] arr;
	

	
	public MyArray() {
		arr=(T[])new Object[10];
		
	}
	
	public void add(T t,int index) {
		if(index<arr.length&&index>=0) {
		arr[index]=t;
		}else {System.out.println(index+"는 배열 범위를 벗어났습니다.");}
	}
	

	public T getPhone(int index) {
		return arr[index];
	}

	 
	
}
