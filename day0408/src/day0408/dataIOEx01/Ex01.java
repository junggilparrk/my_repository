package day0408.dataIOEx01;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String fileName="Ex01Data";
		File file=new File("src/day0408/dataIOEx01",fileName);
		//File FileOutputStream을 연결한다.
		//거기에 BufferedOutputStream을 연결하고 DataOutputStream를 연결. 
		try(DataOutputStream dout=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
			
			//자료형을 써보자
			byte b=10;
			char c='가';
			int i= 1000000;
			double d= 3.14;
			String s = "문자열 데이타";
			dout.write(b);
			dout.writeChar(c);//char 쓰기
			dout.writeInt(i);//int 쓰기
			dout.writeDouble(d);//double 쓰기
			dout.writeUTF(s);//문자열 쓰기
			dout.flush();//얘도 이걸 호출 해야함.
			
			System.out.println("파일 작성 끝");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
