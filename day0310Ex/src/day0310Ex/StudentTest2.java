package day0310Ex;

public class StudentTest2 {
	public static void main(String[] args) {
		
		Student[] arr1=new Student[3];
		arr1[0]=new Student();
		arr1[0].str="박길동";
		arr1[0].age=20;
		arr1[0].kor=75;
		arr1[0].eng=65;
		arr1[0].math=65;
		
		arr1[1]=new Student();
		arr1[1].str="이문동";
		arr1[1].age=30;
		arr1[1].kor=75;
		arr1[1].eng=83;
		arr1[1].math=95;
		
		arr1[2]=new Student();
		arr1[2].str="김민정";
		arr1[2].age=25;
		arr1[2].kor=99;
		arr1[2].eng=84;
		arr1[2].math=77;
		
		
	for(Student s : arr1) {
		System.out.println("----------------");
		s.pritInfo();
	
	int sum=s.kor+s.eng+s.math;
	double avg=sum/3.0;
	System.out.println("총점="+sum+"평균"+avg);
	}
	
	}
}
