package day0405Ex;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx01 {
	public static void main(String[] args) {
		byte[] inByteData=new byte[128];
		
	
		for(int i=0;i<128;i++) {
		
			inByteData[(byte)i]=(byte)i;
			
			
		}
		
		
		ByteArrayInputStream input=null;
		
		input=new ByteArrayInputStream(inByteData);
		int num=-1;
		
		while((num=input.read())!=-1) {
			
			System.out.println("배열 데어터: "+num);
			
		}
	}
}
