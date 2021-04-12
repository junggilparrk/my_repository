package day0402.urlEx02;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex01 {
	public static void main(String[] args) {
		//url로 접속하는 아이
		//url클래스
		
		URL url=null;
		
		try {
			url = new URL("http://www.google.com");
			System.out.println("getHost:" + url.getHost());
			System.out.println("getHost:" + url.getPath());
			url = new URL("https://blog.naver.com/PostView.nhn?blogId=totos1207&logNo=222278603579");
			System.out.println("getHost:" + url.getHost());
			System.out.println("getHost:" + url.getPath());
			System.out.println("query"+ url.getQuery());
			
			URLConnection uc=url.openConnection();//접속
			System.out.println("문서 크기:"+uc.getContentLength());
			System.out.println("문서 타입:"+uc.getContentType());
			
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
