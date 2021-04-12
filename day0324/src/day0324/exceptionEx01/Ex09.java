package day0324.exceptionEx01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		//파일에서 글자를 읽어오는 아이
		//IOException은 checked exception이다 .
		//컴파일시 체크를 해준다.try-catch를 넣어 줘야함.
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();//예외의 실행 코드를 따라가면서 찾아 주는 작업을 함.
			System.out.println("파일이 없음");
		}finally {
			if(fis!=null) {//fis 값이 null일경우 클로즈 메소드를 실행할수 없으니 null일때 상황을 try-catch로 두가지 상황을 체크한다.
				try {
					fis.close();//FileInputStream 사용 시 계속 파일이 실행되는 상황이 발생하므로 close를 이용해 작업을 종료 시켜줘야한다.
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		 System.out.println("코드 종료");
	}
}
