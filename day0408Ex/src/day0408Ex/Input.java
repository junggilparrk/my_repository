package day0408Ex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
	public static void main(String[] args) {
		File file = new File("src/day0408Ex/dout");
		try(DataInputStream din= new DataInputStream(new BufferedInputStream(new FileInputStream(file)))){
			
			byte b=din.readByte();
			short s=din.readShort();
			int i = din.readInt();
			char c = din.readChar();
			float f= din.readFloat();
			String ss=din.readUTF();
			long l = din.readLong();
			System.out.println("바이트:"+b);
			System.out.println("쇼트:"+s);
			System.out.println("인트:"+i);
			System.out.println("캐릭터:"+c);
			System.out.println("플롯:"+f);
			System.out.println("스트링"+ss);
			System.out.println("롱"+l); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	
	}
}
