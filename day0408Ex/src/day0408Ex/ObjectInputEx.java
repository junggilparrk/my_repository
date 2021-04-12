package day0408Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputEx {
	public static void main(String[] args) {
		
		File file = new File("src/day0408Ex","obj");
		try(ObjectInputStream oin= new ObjectInputStream(new FileInputStream(file))){
			 
			Student s= (Student) oin.readObject();
			Car c=(Car) oin.readObject(); 
			Car c1=(Car) oin.readObject();
			System.out.println(s.getName()+" "+s.getAge()+" "+s.getClasses());
			System.out.println(c.getType()+" "+c.getMaxSpeed()+" "+c.getPrice());
			System.out.println(c1.getType()+" "+c1.getMaxSpeed()+" "+c1.getPrice());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
