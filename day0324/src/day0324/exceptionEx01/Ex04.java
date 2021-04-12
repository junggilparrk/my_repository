package day0324.exceptionEx01;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 //인덱스3은 배열의 크기를 벗어나 발생한 오류.
		int [] nums= new int[3];
		
		
		try {	
				nums[0]=10;
				nums[1]=20;
				nums[2]=30;
				nums[3]=40;
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("nums[nums.length] 범위를 초과하였습니다.");
			
		}	
		System.out.println(Arrays.toString(nums));
	}
}
