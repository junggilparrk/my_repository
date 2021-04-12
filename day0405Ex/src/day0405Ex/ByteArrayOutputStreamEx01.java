package day0405Ex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx01 {
	public static void main(String[] args) {
		byte[] result1=new byte[128];

		//input
		ByteArrayInputStream in=new ByteArrayInputStream(result1);
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		
		byte k=127;
		for(int i=0;i<128;i++) {
			result1[i]=k--;
		}
		while(in.available()>0) {
			out.write(in.read());
		}
		byte[] copy = out.toByteArray();
		System.out.println(Arrays.toString(copy));
	}
}
 