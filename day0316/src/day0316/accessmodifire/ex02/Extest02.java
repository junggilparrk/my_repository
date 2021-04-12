package day0316.accessmodifire.ex02;

import day0316.accessmodifire.ex01.Ex01;

public class Extest02 {
//다른 패키지의 경우 import에 해당하는 패키지 이름.class를 적어준다.
	public static void main(String[] args) {
		//day0316.accessmodifire.ex01.Ex01 ex01=new day0316.accessmodifire.ex01.Ex01();도 가능
		Ex01 ex1=new Ex01();
		ex1.publicStr="퍼블릭";
		//ex1.protectedStr="프로텍티드"; 상속 받은 애들만 쓸수 있음.
		//ex1.defaultStr="디폴트"; 같은 패키지에서만 쓸 수 있음.
		//ex1.privateStr="프라이빗"; 클래스 내에서만 쓸수 있음.
		//외부 패키지 제한 가능
			
	}

}
