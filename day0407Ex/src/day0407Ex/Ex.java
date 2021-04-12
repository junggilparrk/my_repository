package day0407Ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex {
	public static void main(String[] args) {
		//buffered를 이용한 파일 복사
		//파일 복사 코드를 Ex프로젝트에서 만드는데
		//파일을 복사 할때 마다 새파일이 만들어 져야하며
		//byte[]를 이용하여 반복의 회수를 줄여보세요.
		try(BufferedInputStream bin=new BufferedInputStream(new FileInputStream(new File("image/night.jpg")));
			BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(new File("src/night.jpg")));){
			
			
			while(bin.available()>0) {
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
