package day0407.fileEx01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		//FIle클래스!
		//파일을 관리해 주는 기능이 있는 클래스
		
		File file=new File("myFile01.txt");
		//파일을 만들거나, 파일이 있는지 판단하거나, 폴더를 만드는 역할.
		//파일이 있는지 판단.
		//day0407/myfileEx01/myFile01.txt피일이 있는지 확인
		file=new File("day0407/myfileEx01/myFile01.txt");
		if(file.exists()) {
			System.out.println("있음");
		}else{
			System.out.println("없음");
		};
		try {
			//없으면 파일을 생성한다.
			//폴더부터 만들어야함
			file=new File("day0407");
			file.mkdir();
			file=new File("day0407/myfileEx01");
			file.mkdir();
			file=new File("day0407/myfileEx01/myFile01.txt");
			file.createNewFile();
			System.out.println("파일이 생성됨");
		} catch (IOException e) {
			System.out.println("파일 생성이 안되요");
			e.printStackTrace();
		}
		
	}
}
