package day0408.dataIOEx01;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01Input {
	public static void main(String[] args) {
		File file = new File("src/day0408/dataIOEx01","Ex01Data");
		try(DataInputStream din=new DataInputStream(new BufferedInputStream(new FileInputStream(file)))){
			//보내진 대상의 순서가 중요하다 동일한 순서로 안할 시 데이터 형태가 달라질수 있음.
			//바이트 단위를 조합해서 꺼내주는 역할임
			byte b=din.readByte();
			char c=din.readChar();
			int i=din.readInt();
			double d = din.readDouble();
			String s = din.readUTF();
			
			System.out.println("byte:"+b);
			System.out.println("char:"+c);
			System.out.println("int:"+i);
			System.out.println("double:"+d);
			System.out.println("String:"+s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
