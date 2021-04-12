package day0405Ex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteIOCopyEx01 {
	public static void main(String[] args) {
		byte [] ori= {12,11,10,9,8,7,6,5,4,3,2,1};
		//10~1까지 들어있는 ori 배열을 만들고
		byte[] bagagi=new byte[3];
		byte[] copy;
		//크기가 3인 바가지 배열을 만들어
		ByteArrayInputStream in=new ByteArrayInputStream(ori);
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		//인풋 스트림과 아웃풋 스트림을 이용하여
		/*
		 * int len = 0; while((len=in.read(bagagi,0,bagagi.length))>0) {
		 * out.write(bagagi,0,len); }
		 */
		while(in.available()>0) {
			out.write(bagagi,0,in.read(bagagi,0,bagagi.length));
		}
		 
		copy=out.toByteArray();
		System.out.println(Arrays.toString(copy));
	
		//copy배열에 복사해 넣는 코드를 만드시오.
		//이때 copy 배열에 {10,9,8,7,6,5,4,3,2,1} 형태로 나와야함.
				
	}
}
 