package day0324Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		try (FileInputStream fi=new FileInputStream("text.text")){
		} catch (FileNotFoundException e) {
			for(i=2;i<10;i++) {
				for(j=1;j<10;j++) {
					k=i*j;
					System.out.println(i+"*"+j+"="+k);
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
}
