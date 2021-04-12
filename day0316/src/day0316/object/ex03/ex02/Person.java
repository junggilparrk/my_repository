package day0316.object.ex03.ex02;

public class Person{
	private String name;
	private int age;
	private Phone phone;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
	}
		public void setPhone(Phone phone) {
			this.phone=phone;
		}
		
		public Phone getPhone() {
			return phone;
		}
	@Override
	public String toString() {
		String str="이름"+name+",나이:"+age+",브랜드:"+phone.getBrand()+",가격:"+phone.getPrice()+",단말기명:"+phone.getName();
		return str;
	}

}
 