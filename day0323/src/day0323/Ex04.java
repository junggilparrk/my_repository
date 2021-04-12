package StringEx01;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		//일정 규칙이 있는 문자 추출
		//<div>hello world!</div>
		//<html><span>test</span><div>Im groot</div></html>
		//<html><span>test</span><div>Fire it up!</div></html>
		//<html><secsion><div>Ready to roll out!</div></section></html>
		//위 코드 <div></div>사이에 있는 글자를 추출하여 출려하시오!
		 
		
	/*	
		String s1="<div>hello world!</div>";
		String s2="<html><span>test</span><div>Im groot</div></html>";
		String s3="<html><span>test</span><div>Fire it up!</div></html>";
		String s4="<html><secsion><div>Ready to roll out!</div></section></html>";
		 
		ArrayList<String> str=new ArrayList<String>();
		str.add(s1);
		str.add(s2);
		str.add(s3);
		str.add(s4);
		
		for(int i=0;i<4;i++) {
			System.out.println(str.get(i).substring((str.get(i).indexOf("<div>")+5), str.get(i).indexOf("</div>")));
		}
*/
		
		String[] sArr=new String [4];
		sArr[0]="<div>hello world!</div>";
		sArr[1]="<html><span>test</span><div>Im groot</div></html>";
		sArr[2]="<html><span>test</span><div>Fire it up!</div></html>";
		sArr[3]="<html><secsion><div>Ready to roll out!</div></section></html>";
		
		String starStr="<div>";
		String endStr="</div>";
		for(int i=0;i<sArr.length;i++) {
			int startIndex=sArr[i].indexOf(starStr)+starStr.length();
			int endIndex=sArr[i].indexOf(endStr);
			System.out.println(sArr[i].substring(startIndex,endIndex)); 
		}		
		
	}
		
}

 