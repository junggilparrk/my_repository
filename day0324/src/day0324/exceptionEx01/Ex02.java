package day0324.exceptionEx01;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
	
		int [] nums= new int[3];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		System.out.println(Arrays.toString(nums));
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 //인덱스3은 배열의 크기를 벗어나 발생한 오류.
		
	}
}
