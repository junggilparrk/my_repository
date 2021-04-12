package day0407Ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BurfferedIOExTest {
	public static void main(String[] args) {
		File file=new File("src/day0407Ex/BurfferedIOExTest.txt");
		try(FileOutputStream fout=new FileOutputStream(file);
			BufferedOutputStream bout=new BufferedOutputStream(fout);){
			
			for(int i=1;i<101;i++) {
				bout.write(i);
			}
			System.out.println("작성 완료");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fin=new FileInputStream(file);
			BufferedInputStream bin= new BufferedInputStream(fin);){
			
			while(bin.available()>0) {
				
				System.out.println(bin.read());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
