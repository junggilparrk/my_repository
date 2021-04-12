package day0408.objectIOEx02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex01Input {
	public static void main(String[] args) {
		File file = new File("src/day0408/objectIOEx02","StudentList");
		try(ObjectInputStream oIn= new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
			
			List<Student> stList= (List<Student>) oIn.readObject();
			for(Student student : stList ) {
				System.out.println(student.getName()+","+student.getAge());
			}
			
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
