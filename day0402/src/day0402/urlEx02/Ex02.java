package day0402.urlEx02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class Ex02 {
	public static void main(String[] args) {
		URL url = null;
		InputStream is = null;
		BufferedReader br=null;
		String docs= null;
		
		try {
			url= new URL("https://www.dhlottery.co.kr/gameResult.do?method=byWin&wiselog=C_A_1_2");
			URLConnection conn = url.openConnection();//타입을 알기위한 접속
			System.out.println("크기"+conn.getContentLength());
			//문서를 가져와보자
			is=url.openStream();
			br= new BufferedReader(new InputStreamReader(is,"euc-kr"));
			
			String s= null;
			for(int i = 0; i<26;i++) {
				System.out.println(br.readLine());
				//한줄씩 읽어 오는 거임 readLine
			}
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
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
