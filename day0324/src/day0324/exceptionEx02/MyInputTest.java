package day0324.exceptionEx02;

import java.io.IOException;

public class MyInputTest {
	public static void main(String[] args) throws IOException {
		MyInput mi=new MyInput(); //객체를 만들고
		System.out.println("문자를 입력하세요");
		String str=mi.readString();
	
		System.out.println("읽어들이는 값:"+str);
		
		System.out.println("**************************************");
		MyInputThrows mit= new MyInputThrows();
		System.out.println("문자를 입력하세요");
		try {
			String str1=mit.readString();
			System.out.println(str1);	
		}catch(IOException e){
			
			System.out.println("입력된값에 오류가 있다.");
		}
	
	}
}
