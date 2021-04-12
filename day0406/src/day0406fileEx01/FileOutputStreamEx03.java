package day0406fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamEx03 {
	public static void main(String[] args) {
		
		File file=new File("src/day0406fileEx01/ex03.txt");
		
		try(FileOutputStream fout=new FileOutputStream(file)){
			
			//한번 쓸때 바이트 단위가 넘어가면 바이트가 짤리게 됨.
			//fout.write(65);//A
			//fout.write(321);//A -128~127->0~255

			String str= "안";
			byte[] strByteArra= str.getBytes();
			System.out.println(strByteArra.length);
			System.out.println(Arrays.toString(strByteArra));
			fout.write(strByteArra);
			
			
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
