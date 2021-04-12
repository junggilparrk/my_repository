package day0324.exceptionEx01;

public class Ex08 {
	public static void main(String[] args) {
		//10개짜리 배열에 0~9까지의 수를 랜덤으로 넣고
		//10을 배열의 값으로 나눈다.
		int []numbers=new int[10];
		for(int i=0;i<numbers.length;i++) {
		numbers[i]=(int)Math.random()*10;
		}
		try {
			for(int i=0;i<11;i++) {
				System.out.println(10/numbers[i]);
			}
		}catch(IndexOutOfBoundsException ie){
			System.out.println("인덱스 아웃오브 예외 발생");
		}catch(ArithmeticException a) {
			System.out.println("0으로 나눠지는 로직이 발생");
		}catch(Exception ea){
			System.out.println("그외 Exception 발생");
		}//Exception은 부모 클래스로 제일 위로 놓으면 다른 익셉션은 작동 하지 않음.
		System.out.println("종료");
	}

}
