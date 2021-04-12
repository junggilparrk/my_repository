package day0316Ex.ex01;

public class User {
private String name;
private String userId;
private String password;
private int point;


 public User(String name,String userId,String password,int point) {
	 this.name=name;
	 this.userId=userId;
	 this.password=password;
	 this.point=point;
	 System.out.println("사용자의 이름:"+name+", 사용자의 아이디:"+userId+", 패스워드:"+password+", 가용 포인트:"+point);
}
 
public void setPoint(int point) {
	 this.point=point;
}
 public int getPoint() {
	 return point;
 }
 
 @Override
	public String toString() {
	 String str="사용자의 이름:"+name+", 사용자의 아이디:"+userId+", 패스워드:"+password+", 가용 포인트:"+point;
		return str;
	}
 
}
 