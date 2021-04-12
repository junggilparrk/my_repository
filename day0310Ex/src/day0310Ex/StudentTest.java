package day0310Ex;

public class StudentTest {
	public static void main(String[] args) {

	
		Student park=new Student();
		park.str="박길동";
		park.age=20;
		park.kor=75;
		park.eng=65;
		park.math=65;

		
		Student lee=new Student();
		lee.str="이문동";
		lee.age=30;
		lee.kor=75;
		lee.eng=83;
		lee.math=95;
		
		Student kim=new Student();
		kim.str="김민정";
		kim.age=25;
		kim.kor=99;
		kim.eng=84;
		kim.math=77;
		
		
		park.pritInfo();
		lee.pritInfo();
		kim.pritInfo();
				
		int sum=park.kor+kim.kor+lee.kor;
		System.out.println("총 국어 성적 총점은"+sum);
		int sum1=park.eng+kim.eng+lee.eng;
		System.out.println("총 영어 성적 총점은"+sum1);
		int sum2=park.math+kim.math+lee.math;
		System.out.println("총 수학 성적 총점은"+sum2);
		
		double avg=(double)sum/3;
		System.out.println("총 국어 성적 평균은"+avg);
		double avg1=(double)sum1/3;
		System.out.println("총 영어 성적 평균은"+avg1);
		double avg2=(double)sum2/3;
		System.out.println("총 수학 성적 평균은"+avg2);
		
				
		
	}
}
