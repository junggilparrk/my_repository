package day0310.ex01;

public class CarTest2 {
	public static void main(String[] args) {
		//배열과, 객체를 이용하여 연관성을 만들어 주차
		//배열?:같은 자료형의 모임
		//구조체(객체):다른 자료형의 모임
		Car[]c = new Car[3];
		c[0]=new Car("검정",1000);
		c[1]=new Car("노랑",500);
		c[2]=new Car("파랑",10000);
	
		
		
		if(c[0].color.equals("노랑")){
			c[0].mileage+=10;
		}
		if(c[1].color.equals("노랑")){
			c[1].mileage+=10;
		}
		if(c[2].color.equals("노랑")){
			c[2].mileage+=10;
		}
		//위 내용은 비교 3번 각각 하는데, 이걸 반복문으로 쓰면 더 편할꺼 같은데??
		//반복문을 쓰려고 했더니.변수명이 다르다.
		//배열로 묶어주자
		//car라는 애들을 담을수 있는 방 3개를 만듬
		Car[] carArr=new Car[3];
		carArr[0]=c[0];
		carArr[1]=c[1];
		carArr[2]=c[2];
		
		for(int i=0;i<carArr.length;i++) {
			if(carArr[i].color.contentEquals("노랑")) {
				carArr[i].mileage+=10;
			}System.out.println(carArr[i].mileage);
		}
		 
		
		Car car5=new Car("흰색",30000);
		
		
		Car car6=new Car("초록색",50000);
		
		
		Car car7=new Car("검정색",100000);
	
		for(int i=0;i<carArr2.length;i++) {
			if(carArr2[i].color.contentEquals("초록색")){
				carArr2[i].mileage+=100;
			}System.out.println(carArr2[i].mileage);
		}
		
		
	}
}
