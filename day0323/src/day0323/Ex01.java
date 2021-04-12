package StringEx01;

public class Ex01 {
	public static void main(String[] args) {
		Car c=new Car();
		c.name="자동차";
		Car c1=c;
		System.out.println("c1.hashCode():"+c1.hashCode());//객체 1개에서 String을 넣으면 값은 같이 변경된다.
		System.out.println("c.hashCode():"+c.hashCode());
		System.out.println("c.name:"+c.name);
		System.out.println("c1.name:"+c1.name);
		
		c1.name="하이";
		System.out.println("c.name:"+c.name);//이름 값을 변경하니 두개의 객체 모두 같은 값으로 변경된다.
		System.out.println("c1.name:"+c1.name);
		
		//기본 클래스
		//문자열 관련 클래스 : String
		//불변객체다.immutable
		
		String str="문자열";
		String str1="문자열";//같은 내용일 경우 전에 만든 객체를 재사용한다.
		String str2=new String("문자열");//new로 만들면 내용이 같아도 따로 주소값을 갖는다.
		System.out.println("str.hashCode():"+str.hashCode());
		System.out.println("str1.hashCode():"+str1.hashCode());
		System.out.println("str2.hashCode():"+str2.hashCode());

	
		System.out.println("str"+str);
		str="문자열1";
		System.out.println("str.hashCode():"+str.hashCode());//내용을 변경하여 두개의 객체는 다른 객체로 변경되어 주소값도 달리짐
		System.out.println("str1.hashCode():"+str1.hashCode());//주소값이 다른 str1은 
		System.out.println("str"+str);
		System.out.println("str1"+str1);
		
		//변수에 담긴 주소를 비교함. 두주소가 같다.
		System.out.println(str==str1);//참
		
		//변수에 담긴 주소를 비교하기 때문에 다른 값이다.
		System.out.println(str1==str2);//거짓
		
		String result=(str1==str2)?"참":"거짓";
		System.out.println(result);//거짓//주소로 비교
		
		String result1=(str1.equals(str2))?"참":"거짓";
		System.out.println(result1);//참//내용으로 비교
		
	}
}
