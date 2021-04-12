package day0408Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutpurEx {
	public static void main(String[] args) {
		
		File file = new File("src/day0408Ex","obj");
		try(ObjectOutputStream oout= new ObjectOutputStream(new FileOutputStream(file))){
			//Student s= new Student("홍길동", 16, 3);
			Student s= new Student("홍길동", 16, 3);
			Car c= new Car("SportsCar", 140, 200000000);
			Car c1= new Car("bonggo",100,10000000);
			oout.writeObject(s);
			oout.writeObject(c);
			oout.writeObject(c1);
			System.out.println("파일 작성 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
