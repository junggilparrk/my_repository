package day0408Ex;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
	public static void main(String[] args) {
		String fileName="dout";
		File file = new File("src/day0408Ex",fileName);
		
		
		try(DataOutputStream dout=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
			byte b=10;
			short s=1561;
			int i= 1651651651;
			char c='d';
			float f=1.11123f;
			String ss="안녕하신가요?";
			long l = 1221651651L;
			
			dout.write(b);
			dout.writeShort(s);
			dout.writeInt(i);
			dout.writeChar(c);
			dout.writeFloat(f);
			dout.writeUTF(ss);
			dout.writeLong(l);
			dout.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
		}
	}

