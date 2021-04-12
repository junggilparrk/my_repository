package day0402Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



public class Ex01 {
	public static void main(String[] args) {
		//크롤링..
		//url 로 동행복권 회차별 당첨 번호 페이지에서 최신 회차 당첨 번호를 배열에 담에 출력하시오
		URL url= null; //url로 접속을 도와주는 클래스
		BufferedReader br=null;//읽어 오는 아이
		InputStream is= null;//읽어 오는 아이
		String st=null;
		String docs="";
		
		try {
			url= new URL("https://dhlottery.co.kr/gameResult.do?method=byWin&drwNo=956");
			is=url.openStream();//문서를 읽어 주는 아이를 받아다가 성능이 더 좋은 아이로 변경했다.
			br=new BufferedReader(new InputStreamReader(is, "euc-kr"));
			for(int i=0;i<10000;i++) {
				st=br.readLine();
				if(i>=3972 && i<=3977) {
				
					docs+=st;
				}
			
				
			}
			System.out.println(docs);
			String str="<span class=\"ball_645 lrg ball1\">";
			String str1="</span>";
			String str2="<p><span class=\"ball_645 lrg ball4\">";
			
			
			int start=docs.indexOf(str)+str.length();
			int start1=docs.indexOf(str1);
			int start2=docs.indexOf(str2)+str2.length();
			System.out.println(start1);
			System.out.println(start);
			System.out.println(start2);
			
			
			String[] lotto=new String[6];
			for(int i=0;i<lotto.length;i++) {
				int s=50*i;
				lotto[i]=st.substring(start+s, start1+s);
			
			}
			for(int i=91021;i<100000;i++) {
				st+=br.readLine();
				
			}
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
