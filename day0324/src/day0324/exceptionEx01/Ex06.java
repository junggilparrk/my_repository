package day0324.exceptionEx01;

public class Ex06 {//trt-catch를 if로 대신해서 실행도 가능
	public static void main(String[] args) {
		//finally
		String[] sArr= new String[0];
		
		try {
			sArr[0]="예외발생";
			
		}catch(IndexOutOfBoundsException i) {
			System.out.println("인덱스 값을 벗어납니다.");
		}finally {
			System.out.println("반드시 실행되야 하는 내용");
		}
	}
}
