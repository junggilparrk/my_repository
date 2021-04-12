package day0324.exceptionEx01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		//try-with-resource문
		//close() 자동으로 호출해준다
		//(AutoCloseable 인터페이스를 구현한 애들)만 자동으로 닫아준다.
		try(FileInputStream fis=new FileInputStream("txt.txt")){
			
		} catch (FileNotFoundException e) {//파일을 찾을 수 없을 때
			e.printStackTrace();
			System.out.println("파일을 못찾음");
		} catch (IOException e) {//입출력시 발생하는 예외
			e.printStackTrace();
			System.out.println("입출력 하다가 문제가 발생");
		}
	}
}
