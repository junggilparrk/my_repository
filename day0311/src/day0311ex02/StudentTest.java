package day0311ex02;

public class StudentTest {
	public static void main(String[] args) {
			int sum=0,sum1=0,sum2=0,avg=0,avg1=0,avg2=0;
				Student[] arr1=new Student[3];
					arr1[0]=new Student("김길동", 20);
					arr1[0].kor=50;
					arr1[0].math=80;
					arr1[0].eng=70;						
					arr1[1]=new Student("이정호", 33, 30, 20, 50);
					arr1[2]=new Student("문승진", 99, 100, 50);
			for(Student s:arr1) {
				System.out.println("이름:"+s.name+" 나이:"+s.age+" 국어성적:"+s.kor+" 수학성적:"+s.math+" 영어성적:"+s.eng);	
				sum+=s.kor;
				avg=sum/arr1.length;
				sum1+=s.math;
				avg1=sum1/arr1.length;
				sum2+=s.eng;
				avg2=sum2/arr1.length;
			}
			System.out.println("국어 총점:"+sum+" 국어 평균:"+avg+" 수학 총점:"+sum1+" 수학 평균:"+avg1+" 영어 총점:"+sum2+" 영어 평균:"+avg2);
	}			
}
 
 