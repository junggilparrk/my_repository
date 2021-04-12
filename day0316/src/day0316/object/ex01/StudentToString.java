package day0316.object.ex01;

public class StudentToString {
	private String name;
	
	public void setName(String name) {
		if(name.equals("바보")) { 
		this.name=name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	//object를 상속한 상태
	//object에 있는 메서드를 사용할 수 있다.
	@Override
	public String toString() {
		return "하이";
	}
}
  