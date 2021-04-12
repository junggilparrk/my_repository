package day0409.tcpex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyTcpClientUseFile {
	public static void main(String[] args) {
		
		Socket socket= null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			Scanner sc=new Scanner(System.in);
			socket=new Socket("127.0.0.1",7777);
			System.out.println("서버의 접속 성공");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
			 
		while(true) {
			String str=sc.nextLine();
			bw.write(str+'\n');
			bw.flush();
			String msg=br.readLine();
			System.out.println(">>>"+msg);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}finally { 
			
				if(socket!=null) {try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}}
				if(br!=null) {try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}}
				if(bw!=null) {try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}}
			
		}
	}
}
