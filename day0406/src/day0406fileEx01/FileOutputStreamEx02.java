package day0406fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx02 {
		public static void main(String[] args) {
			//파일을 쓰기위한 FileOutputStream 객체가 필요함
			//파일주소 또는 파일객체도 필요
			//파일 객체를 생성
			//new File(위치, 주소)
			File file=new File("src/day0406fileEx01/test.txt");
			
			//파일 아웃풋 스트림에 파일을 연결하여 객체를 생성
			//try 리소스 방식으로 만들면 자동으로 클로즈 된다.
		try(FileOutputStream fout=new FileOutputStream(file)){
			//파일에 데이터를 쓴다.
			//a~z까지 파일에 쓴다.
			char c='a';
			for(int i='a';i<='z';i++) {
				fout.write(i);
				
			}
			System.out.println("다 작성했음");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//이미 트라이 리소스 방식으로 닫아지도록 되어 있음.
			
	}
}
