package day0407.fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileCopyEx01 {
	public static void main(String[] args) {
		//파일 복사
		//파일을 읽어서 원하는 파일을 읽고 새파일에 쓰면 됨
		String fileName=LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm-ss-SSS"));
		try(BufferedInputStream bin=new BufferedInputStream(new FileInputStream(new File("image/night.jpg")));
				BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(new File("src/night.jpg")))){
			 
			byte[] buf=new byte[100000];
	
			
			 while(bin.available()>0) {
				 bout.write(buf,0,bin.read(buf,0,buf.length));
			 }
			 bout.flush();
			 System.out.println("파일 복사 끝");
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

