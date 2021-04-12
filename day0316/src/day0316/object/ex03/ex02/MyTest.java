package day0316.object.ex03.ex02;

public class MyTest {
	public static void main(String[] args) {
		int sum=0;int avg=0;
		Person[] arr1=new Person[3];
		arr1[0]=new Person("홍길동", 30);
		arr1[1]=new Person("김창범",50);
		arr1[2]=new Person("이수만",60);
		
		Phone[] arr2=new Phone[3];
		arr2[0]=new Phone("삼성",1500000,"갤럭시");
		arr2[1]=new Phone("애플",1300000,"아이폰");
		arr2[2]=new Phone("LG",1200000,"G4");
		
		arr1[0].setPhone(arr2[0]);
		arr1[1].setPhone(arr2[2]);
		arr1[2].setPhone(arr2[1]);
		
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i].getName()+"의 핸드폰 이름은 "+arr1[i].getPhone().getName());
			System.out.println(arr1[i].getName()+"의 핸드폰 가격은 "+arr1[i].getPhone().getPrice());			
			sum+=arr1[i].getPhone().getPrice();
			avg=sum/3;
		}
		
		System.out.println("세 사람의 핸드폰 평균 가격은 "+avg);
	
		Person max=null;
		
		if(arr1[0].getPhone().getPrice()>arr1[1].getPhone().getPrice()) {
			max=arr1[0];
		}else {
			max=arr1[1];
		} 
			
		if(max.getPhone().getPrice()>arr1[2].getPhone().getPrice()) {
			max=max;
		}else {max=arr1[2];
		}
			System.out.println("가장 비싼 폰을 가진 이름은 "+max.getName()+" 나이는 "+max.getAge());
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
