package day0324Ex;

import java.io.IOException;

public class MakeExceptionTest {
	public static void main(String[] args) {
		
		  MakeExceptionEx m= new MakeExceptionEx(); 
		  m.makeArthmeticException();
		 
		  MakeExceptionEx IOE= new MakeExceptionEx();
		  
			try {
				IOE.makeIOException();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}
}
