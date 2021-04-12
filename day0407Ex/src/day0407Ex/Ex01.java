package day0407Ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		//day0407Ex 프로젝트에서
		//day0407 프로젝트에 있는
		//FileCopyEx01.java 파일을 읽어 화면에 출력하고
		//day0407Ex프로젝트 안에 src 폴더 안에 day0407/bufferedEx02 폴더를 만들어서
		//그안에 복사해 넣는 코드를 만들어 보세요
		
		
		try {File file=new File("src/day0407/bufferedEx02");
			if(file.isFile()) {
			}else {
			file.mkdirs();
			file.createNewFile();} 
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try(BufferedInputStream bin=new BufferedInputStream(new FileInputStream(
				new File("C:\\Users\\TJOEUN\\eclipse-workspace\\day0407\\src\\day0407\\fileCopy/FileCopyEx01.java")));
					BufferedOutputStream bout=new BufferedOutputStream(
						new FileOutputStream("src/day0407/bufferedEx02/FileCopyEx01.java"));){
			
			
			
			while(bin.available()>0) {
				bout.write(bin.read());
				
				System.out.print((char)bin.read());
				
			}		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
		
	}
}
