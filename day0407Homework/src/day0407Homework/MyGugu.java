package day0407Homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;




public class MyGugu {
	public void makeGugufile() {
		
		
		File file=new File("gugu.txt");
		if(file.isFile()) {
			
		}else {
				try {
					file.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
		try(BufferedOutputStream bout=new BufferedOutputStream
				(new FileOutputStream(new File("gugu.txt"))))
		{
			/*
			 * for(int i=1;i<=9;i++) { 
			 * 		for(int j=2;j<=9;j++) { 
			 * 			bout.write(j+'0'); 
			 * 			bout.write('*'); 
			 * 			bout.write(i+'0'); 
			 * 			bout.write('='); 
			 * 			//10의 자리
			 * 			if(i*j>=10){  bout.write(i*j/10+'0');//10의 자리 
			 * 			bout.write(i*j%10+'0');//1의 자리 
			 * 			}else{ bout.write(i*j+'0'); 
			 * 			} 
			 * 		}
			 * 		bout.write(' '); 
			 * } bout.write(\n');
			 */			 
			
			
			for(int i='1';i<='9';i++) {
				for(int j='2';j<='9';j++) {
					bout.write(j);
					bout.write('*');
					bout.write(i);
					bout.write('=');
					int k=(i-48)*(j-48);
					String str=Integer.toString(k);
					bout.write(str.getBytes());
					bout.write('\t');
				}bout.write('\n');
			} 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readGuguFile() {
		File file=new File("gugu.txt");
		if(file.exists()) {
		
		try(BufferedInputStream bin=new BufferedInputStream
				(new FileInputStream(new File("gugu.txt")))){
				
				byte[] strArray=bin.readAllBytes();
				String str = new String(strArray);
				System.out.println(str);
				
				/*
				 * while(bin.available()>0) { System.out.print((char)bin.read()); }
				 */
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
}	

