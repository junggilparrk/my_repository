package day0405_0408.tcpEx01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyTcpClient {
	public static void main(String[] args) {
			System.out.println("서버 소켓에 연결");
		try(Socket socket=new Socket("192.168.1.44",7777);
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
					BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));)
		{
			while(true) {
			System.out.println("서버와 연결이 됨.");
			String msg = br.readLine();
			System.out.println("서버로 부터 읽은 메세지1: "+msg);
			System.out.println("메세지를 입력해주세요\n");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			
			bw.write(str+"\n");
			bw.flush();
			System.out.println("클라이언트 종료");
		}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
