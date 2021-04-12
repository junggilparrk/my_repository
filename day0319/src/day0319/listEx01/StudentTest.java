package day0319.listEx01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 몇명을 입력하시겠습니까?");
		int studentCnt=sc.nextInt();
		System.out.println("학생 정보를 입력해 주세요");
		ArrayList<Student> s1=new ArrayList<>();
		
		for(int i=0;i<studentCnt;i++) {	
			System.out.println("이름을 입력해 주세요:");
			String name=sc.next();
			System.out.println("나이를 입력해주세요");
			int age= sc.nextInt();
			System.out.println("국어 성적을 입력해주세요");
			int kor=sc.nextInt();   
			System.out.println("영어 성적을 입력해주세요");
			int eng=sc.nextInt();
			System.out.println("수학 성적을 입력해주세요");
			int math=sc.nextInt();		
		s1.add(new Student(name,age,kor,eng,math));
		} 
		for(Student s :s1) {
			System.out.println(s);
		}
		int KorSum=0;
		int engSum=0;
		int mathSum=0;
		for(Student s:s1) {
			KorSum+=s.getKor();
			engSum+=s.getEng();
			mathSum+=s.getMath();
			
		}
		System.out.println("국어 총합:"+KorSum+",평균:"+(KorSum/s1.size()));
		System.out.println("영어 총합:"+engSum+",평균:"+(engSum/s1.size()));
		System.out.println("수학 총합:"+mathSum+",평균:"+(mathSum/s1.size()));	
		System.out.println("종료");
		
		/*
		 * int sum=0;int avg=0;int sum1=0;int sum2=0;int avg1=0;int avg2=0;
		 * ArrayList<Student> s=new ArrayList<>(); s.add(new
		 * Student("홍길동",20,30,50,60)); s.add(new Student("김상범",25,50,60,70)); s.add(new
		 * Student("이창준",10,40,35,100)); s.add(new Student("탁영준",40,10,10,10));
		 * s.add(new Student("고길동",50,50,50,50)); System.out.println(s); for(int
		 * i=0;i<5;i++) { System.out.println(s.get(i).getName()+" "+s.get(i).getAge());
		 * sum+=s.get(i).getKor(); sum1+=s.get(i).getEng(); sum2+=s.get(i).getMath();
		 * avg=sum/5; avg1=sum1/5; avg2=sum2/5;
		 * 
		 * }System.out.println("국어 평균:"+avg+", 영어평균:"+avg1+", 수학평균:"+avg2);
		 */
		
		  
	}
}
 