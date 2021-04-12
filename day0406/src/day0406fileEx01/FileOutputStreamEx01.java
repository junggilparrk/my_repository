package day0406fileEx01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {
	public static void main(String[] args) {
		//파일에 쓰기 위해서는 필요한 놈
		FileOutputStream fout = null;
		
		try {
				//FileOutputStream(쓰고자 하는 대상 파일 주소 or 파일객체).
				//파일주소는 상대주소 or 절대주소를 넣어 줄수 있음
				//상대경로는 현재 프로젝트를 기준으로 하는구나
				//fout=new FileOutputStream("../../test.txt");
				//output 스트림 객체.write(사용할 데이터)
				//절대경로
				fout=new FileOutputStream("C:/Users/TJOEUN/new_test.txt");
				fout.write(65);
				System.out.println("작성함");
				
				Thread.sleep(100000);
				  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			if(fout!=null) {
				try {//반드시 닫아 주어야 한다.
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
