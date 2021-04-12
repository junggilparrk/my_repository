package StringEx01;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		//글자의 위치를 판단하는 메서드
		String s1="I'm groot and I'm groot!";
		
		//groot의 시작 위치는?
		System.out.println("groot의 시작위치:"+s1.indexOf("groot"));
		//찾는 값이 없다면 -1을 반환한다.
		
		//찾는 위치를 지정하는 방식//첫번째 위치를 지나서 부터 찾으면 찾을 수 있음
		System.out.println("2번쨰 groot의 위치는?:"+s1.indexOf("groot", 5));
		
		String s2="아기상어 뚜 루루 뚜루 귀여운 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 아기 상어 엄마 상어 뚜 루루 뚜루 어여쁜 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 엄마 상어 아빠 상어 뚜 루루 뚜루 힘이 센 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 아빠상어 할머니 상어 뚜 루루 뚜루 자상한 뚜 루루 뚜루 바닷속 뚜 루루 뚜루";
		//엄마 상어 라는 글자의 위치는?
		//바닷속 글자의 위치는 어디? 모두 찾으시오
		System.out.println("엄마상어 위치는:"+s2.indexOf("엄마 상어"));
		int start=0;//바닷속이라는 글자의 시작위치를 넣기위한 변수
		int cnt=0;//바닷속의 개수를 넣기 위한 변수
		while((start = s2.indexOf("바닷속", start))!=-1) {
			cnt++;
			System.out.println("위치:"+start);
			start++;
		}
		System.out.println("바닷속 개수:"+cnt);
		
		
		//문자열을 특정 기준으로 나누는 메서드
		String s3="300,400,500,125,200";
		//, 기준으로 나눠 배열에 담는 매서드.
		
		String[] num3=s3.split(",");//인자로 정규식이 들어간다.
		System.out.println(Arrays.toString(num3));
		int sum=0;
		for(String string : num3) {
			sum+=Integer.parseInt(string);//parseInt는 문자열을 숫자로 변경
		}System.out.println("총합:"+sum);
		
		String s4="300+400+500";
		String[] nums2=s4.split("\\+");//+는 \\+를 해줘야 정규식으로 변경해줌.
		
		for(String string :nums2 ) {
			System.out.println(string);
		}
		
		
	}
}
