package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;



public class UDPreciTest {
	public static void main(String[] args) {
		try {
			DatagramSocket socket= new DatagramSocket(7777);
			
			byte[] buf=new byte[3000];
			
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			System.out.println("데이터 대기중....");
			socket.receive(packet);
			System.out.println("받은 데이터:"+new String(buf).trim());
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
