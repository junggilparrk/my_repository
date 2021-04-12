package day0409.tcpex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyTcpServerUseWhile {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			Scanner sc=new Scanner(System.in);
			serverSocket=new ServerSocket(7777);//서버의 포트번호
			
			System.out.println("접속 대기중...");
			socket=serverSocket.accept();//엑셉트 진행후 클라이언트와 연결된 소켓을 반환
			
			System.out.println(">>>클라이언트 -"+socket.getInetAddress());
			System.out.println("접속 성공....");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
			 
		while(true) {	
			String msg=br.readLine();
			System.out.println(">>> "+msg); 
			
			bw.write(sc.nextLine()+"\n");
			bw.flush();
			
		}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(serverSocket!=null) {try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}}
			if(socket!=null){try {
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

