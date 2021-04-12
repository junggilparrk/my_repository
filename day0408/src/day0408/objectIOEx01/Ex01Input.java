package day0408.objectIOEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex01Input {
	public static void main(String[] args) {
		//좀전에 만든 빈센조를 가져와 보자.
		//역직렬화 해서 가져오기
		File file = new File("src/day0408/objectIOEx01","person");
		try(ObjectInputStream oin= new ObjectInputStream(new FileInputStream(file))){
			
			Person p = (Person) oin.readObject();
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getHeight());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
