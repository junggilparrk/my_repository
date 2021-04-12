package day0407Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		File file=new File("2021/04/07/testMyfile");
		try {
			file=new File("2021/04/07");
			file.mkdirs();
			file=new File("2021/04/07/testMyfile");
			file.createNewFile();
			System.out.println("파일이 생성됨");
		} catch (IOException e) {
			System.out.println("파일이 안생성됨");
			e.printStackTrace();
		}
		try(FileOutputStream fout=new FileOutputStream(file);){
			for(int i='a';i<='z';i++) {
				fout.write((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
 