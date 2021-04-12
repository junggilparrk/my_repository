package day0310Ex;

public class Student {
//필드
//name : 문자열
//age : 정수
//kor : 정수(국어성적)
//eng : 정수 (영어성적)
//math : 정수 (수학성적)

//필드를 출력하는 메서드
//printInfo(){ }
//객체 3개를 만들고
//각각의 객체에 값을 넣은 후 
//메서드를 사용하여 필드의 내용을 출력
//각각의 객체의 성적의 총점, 평균을 구하여라
//평균은 가능하면 소수점이 나올 수 있도록 해보세요.	
	String str="name";
	int age;
	int kor;
	int eng;
	int math;
	
	
	
	
	public void pritInfo() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		String name="이름은 "+str;
		String ag=" 나이는 "+age;
		String str=" 국어 성적은 "+kor;
		String str1=" 영어 성적은 "+eng;
		String str2=" 수학 성적은 "+math;
		String str3=" 성적의 총점은 "+sum;
		String str4=" 성적의 평균은 "+avg;
		System.out.println(name+ag+str+str1+str2+str3+str4);
	}
	
}
