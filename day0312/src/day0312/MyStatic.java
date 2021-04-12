package day0312;

public class MyStatic {
	//인스턴스 변수
	int noneStaticNum;
	//정적변수,클래스 변수
	static int staticNum;

	//스태틱 메서드
	static void printNumbers() {
	//	System.out.println(noneStaticNum); //이건 쓸수 없다.
		System.out.println(staticNum);
	}
}
