package StringEx01;

public class Ex02 {
	public static void main(String[] args) {
		//String 에는 여러가지 메서드를 갖고 있음.
		//대소문자 변경
		String alpha="abcdefg";
		System.out.println(alpha.toUpperCase());//대문자 변경
		alpha="abCdEfG";
		System.out.println(alpha.toLowerCase());//소문자 변경
		char[]sArr=alpha.toCharArray();//String을 문자열의 배열로 변경하여 한글자씩 변경 가능
		System.out.println(alpha);//문자 배열로 변경된 상태
		
		String result="";
		if(alpha.charAt(0)<='z' && alpha.charAt(0)>='a') {
			result=alpha.replaceFirst(alpha.charAt(0)+"",(char)(alpha.charAt(0)-32)+"");	
		}//+""를 함으로써 Char형을 String 으로 바꿔줌
		System.out.println(result);
		
		
		//문자열 자르기
		String str1="hello world, welcome to my house";
		System.out.println(str1.substring(13));//입력부터 끝까지 저룸
		System.out.println(str1.substring(13, 20));//(시작인덱스)입력칸부터 (끝인덱스//불포함)입력 칸까지 자름
		
	} 
}
