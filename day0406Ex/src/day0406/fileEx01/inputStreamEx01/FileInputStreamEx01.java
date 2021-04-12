package day0406.fileEx01.inputStreamEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {
	public static void main(String[] args) {
		File file=new File("src/FileInputStreamEx01Text.txt");
		try(FileInputStream fin=new FileInputStream(file)){
			
			while(fin.available()>0) {
				int c= fin.read();
				System.out.println((char)c);
			}
		 	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
