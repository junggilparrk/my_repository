package day0312.inheritance.ex02;

public class CarPhoneTest {
	public static void main(String[] args) {
	Phone p=new Phone();
	p.brand="Apple"; 
	p.name="I-Phone11"; 
	p.price="1,100,000";
	p.storage="64기가";
	System.out.println(p.printInfo());
	p.call();
	
	Phone s=new Phone();
	s.brand="Samsung"; 
	s.name="갤럭시 노트10"; 
	s.price="1,050,000";
	s.storage="128기가";
	System.out.println(s.printInfo());
	s.printinfo("Samsung", "갤럭시 노트10", "1,050,000");
	s.call();
	
	Car c=new Car();
	c.brand="아우디"; 
	c.name="a6";
	c.price="300,000,000";
	c.carType="Sports Car";
	c.seater=4;
	c.maxSpeed="140km/h";	
	System.out.println(c.printInfo());
	c.printinfo("아우디", "a6", "300,000,000");
	c.strarUp();
	c.go();
	
	}
}
 