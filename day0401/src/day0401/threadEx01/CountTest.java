package day0401.threadEx01;

public class CountTest extends Thread{
	public static void main(String[] args) {
		//1에서 9까지 1초씩 출력하는 코드를 만들어 보자.
		for(int i=1;i<10;i++) {
			System.out.println(i+"초");
			
			try {
				Thread.sleep(1000);//1초씩 잠재움
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("초 종료");
		
		for(int i=1;i<10;i++) {
			System.out.println(i+"떙");
			
			try {
				Thread.sleep(1000);//1초씩 잠재움
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("땡 종료");
	}
}
