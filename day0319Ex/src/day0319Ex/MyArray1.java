package day0319Ex;

public class MyArray1 <E>{
	private E[] arr1;
	private Phone p1;
	private int n;
	public MyArray1(Phone p1) {
		
		arr1=(E[])new Object[n];
		this.p1=p1;
	}
	
	public void add1(E e) {
		arr1[n]=e;	
	}
	
	public Phone get(E e) {
		return p1;
	}
	
}
