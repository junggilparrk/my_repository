package day0406.fileEx01;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExTest01 {
	public static void main(String[] args) {
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("test.txt");
			String msg="알파벳 작성 완료";
			byte[] hang=msg.getBytes();
			byte [] alpa = new byte[26];
			int num=0;
			 for(int i='a';i<='z';i++) {
				alpa[num]=(byte)i;
			}
			 fout.write(alpa, 0, 26);
			 fout.write(hang,0,hang.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout!=null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
