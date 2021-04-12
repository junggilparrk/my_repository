package day0408.readerwriterEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		File file = new File("src/day0408/readerwriterEx01","hello.txt");
		try(FileWriter fw =new FileWriter(file)){
			fw.write("글자를 넣을 수 있습니다.");
			fw.flush();
			System.out.println("파일을 작성했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader(file)){
			
			//System.out.println((char)fr.read());//한번 read하면 2byte 읽음
			int c =-1;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
