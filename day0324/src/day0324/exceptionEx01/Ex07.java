package day0324.exceptionEx01;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		//finally는 파일이나 입,출력 관련해서 객체를 닫아야 할 때 주로 쓴다.
		int[] arr=new int[10];
		try {	arr[10]=0;
		}catch(IndexOutOfBoundsException a) {//다형성을 이용하여 Exception으로 만 적을 수 있다.
				System.out.println("인덱스 범위를 초과하였습니다.");
		}finally {
				arr=null;
		}
		System.out.println(Arrays.toString(arr));
	}
}
