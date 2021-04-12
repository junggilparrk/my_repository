package ex01;

import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		
/*		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int num=scan.nextInt();
		System.out.println(num+"은 3의 배수인가? ");
		if(num%3==0) {
		System.out.println(num+"은 3의 배수 입니다.");
		}else {System.out.println(num+"은 3의 배수가 아닙니다.");
		}

	//삼항 연산자
	//(조건식)? 참일때 값 : 거짓일 때 값;	
	// String result=(num%5==0)? "5의 배수이다.":"5의 배수가 아니다";
	// System.out.println(result);
	한줄로 표현 가능

		System.out.println("숫자를 입력해주세요 : ");
		int num1=scan.nextInt();
		System.out.println(num1+"은 5의 배수인가? ");
		if(num1%5==0) {
		System.out.println(num1+"은 5의 배수 입니다.");
		}else {System.out.println(num1+"은 5의 배수가 아닙니다.");
		}
		
		System.out.println("점수를 입력해주세요 : ");
		int i=scan.nextInt();
		
		if(i==100) {
			System.out.println("만점입니다.");
		}else if(i>=90) {
			System.out.println("A학점 입니다.");
		}else if(i>=80){
			System.out.println("B학점 입니다.");
		}else if(i>=70){
			System.out.println("C학점 입니다.");}
		else if(i>=60){
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
	//swich-case 문
 		swich(키){
 			case 값1:
 			case 값2:
 			case 값3:
 			default:
 		}
 		int key =3;
 		swich(key){
 			case 1:
 			System.out.println("키는 1이다");
 			break;
 			case 2:
 			System.out.println("키는 2이다");
 			break;
 			case 3:
 			System.out.println("키는 3이다");
 			break;
 			case 4:
 			System.out.println("키는 4이다");
 			break;
 			case 5:
 			System.out.println("키는 5이다");
 			break;
 		//한번 실행 시 전체가 실행 되므로 case 한개당 break를 넣어 준다.	
 		//case1: case6: //case 1 또는 6일때 값 입력 가능 
 		//key에는 문자, 문자열, 숫자 가능
 		  
 		 
		
		System.out.println("알파벳을 입력해주세요 : ");
		char num2=scan.next().charAt(0);
		//String str=sc.nexLine();//문자열을 입력 받음.
		//char c = str.charAt(0);//문자열에서 맨 앞의 문자 하나를 가져옴.
		if(num2>64&&num2<91) {
			System.out.println("알파벳"+num2+"는 대문자입니다.");
		}else if(num2>97&&num2<122){
			System.out.println("알파벳"+num2+"는소문자입니다.");
		}else {
			System.out.println(num2+"는 알파벳이 아닙니다.");
		}
		
		//if(num2>='A' %% num2<='Z'){
		  System.out.println("알파벳"+num2+"는 대문자입니다.");
		  }else{if(num2>='a' %% num2<='z'){
		  System.out.println("알파벳"+num2+"는 소문자입니다.");
		  
		int num3=56827;
		int a,b,c,d,e;
		int cnt=0,cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		int temp=num3-((num3/10000)*10000);
		int temp2=temp-((temp/1000)*1000);
		int temp3=temp2-((temp2/100)*100);
		int temp4=temp3-((temp3/10)*10);
		
		
		//int money = 56827;
		  int manwon= money/10000;
		  int chunwon= money%10000/1000;
		  int backwon= money%1000/100;
		  int shipwon= money%100/10;
		  int ilwon= money%10;
		  
		for(a=0;a<num3/10000;a++) {
			cnt=cnt+1;		
		}
		for(b=0;b<temp/1000;b++) {

			cnt1++;
		}
		for(c=0;c<temp2/100;c++) {

			cnt2++;
		}		
		for(d=0;d<temp3/10;d++) {

			cnt3++;
		}
		for(e=0;e<temp4;e++) {

			cnt4++;
		}
		System.out.println("만원 "+cnt+"개, "+"천원 "+cnt1+"개, "+"백원 "+cnt2+"개, "+"십원 "+cnt3+"개, "+"일원 "+cnt4+"개");
		
		for(int s=1;s<101;s++) {
			if(s%4==0) {
				System.out.println(s+"는 4의 배수");
			}
		}
	*/	
/*		for(int i=5;i>0;i--) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
				for(int j=0;j<i;j++) {
					System.out.print("#");			
				}System.out.println();
			}
		
		int num1=(int)(Math.random()*91+10);
		int num2=(int)(Math.random()*91+10);
		System.out.println("랜덤수 : "+num1);
		System.out.println("랜덤수 : "+num2);
		int num3 = (num1<num2)? num1:num2;
		for(int k=1; k<num3;k++) {
			if(num1%k==0&&num2%k==0) {
				System.out.println("두수의 공약수"+k);
			}
		}
		
		for(int k=1;k<num1;k++) {
			if(num1%k==0) {
				System.out.println(k+"는"+num1+"의 약수");
			}
		}
		for(int k=1;k<num2;k++ ) {
			if(num2%k==0) {
			System.out.println(k+"는"+num2+"의 약수");
			}
		}
		
int j;
		for(j=3;j<=100;j++) {
			int cnt=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				cnt++;
			}
		}
		
		if(cnt==2) {
			System.out.println(j+"은 수소다");
		}
		}	
		System.out.println("숫자를 입력해주세요 : ");

	*/	
	/* 숙제	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력해주세요 : ");
		int num=scan.nextInt();
		
		switch(num) {
		case 100: 
			System.out.println("만점입니다.");
			break;
		case 99: case 98:  case 97:  case 96: case 95:  case 94:  case 93:  case 92:  case 91:  case 90: 
			System.out.println("A학점 입니다.");
			break;
		case 89: case 88:  case 87:  case 86: case 85:  case 84:  case 83:  case 82:  case 81:  case 80: 
			System.out.println("B학점 입니다.");
			break;
		case 79: case 78:  case 77:  case 76: case 75:  case 74:  case 73:  case 72:  case 71:  case 70: 
			System.out.println("C학점 입니다.");
			break;
		case 69: case 68:  case 67:  case 66: case 65:  case 64:  case 63:  case 62:  case 61:  case 60: 
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			break;
	}
		
	
	System.out.println("알파벳을 입력해주세요");
	char num2=scan.next().charAt(0);
	 
	 if(num2>64&&num2<91) {
		 System.out.println((char)(num2+32));
	 }else {
		 System.out.println((char)(num2-32));
	 
	}
	*/


 }
}

