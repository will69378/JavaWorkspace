package com.kh.chap03_protocol.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerRun {
	
	/*

UDP 
	- 비연결지향 프로토콜로 클라이언트가 데이터를 받았는지 아닌지 상관하지 않는 방식의 프로토콜
	- 데이터 전송의 신뢰도가 낮으며 데이터의 손실이 발생할 수 있다.
	- 번거로운 확인절차(3way handshake 등)를 없앰으로써 신속하게 데이터를 전달할 수 있다.
	- 빠른 데이터 전송이 중요한 실시간 스트리밍, 게임 등에서 사용된다.
	
DatagramSocket
	- UDP 통신에서 DatagramPacket을 보내고 받는데 사용하는 클래스
	- UDP는 DatagramPacket 단위로 데이터를 송/수신할 수 있다.
	
DatagramPacket
	- UDP 통신시 데이터를 포장하는 클래스 (Wrapping)
	- 전송할 데이터(byte[]) 와 호스트의 IP 주소 및 포트번호를 함께 전송한다.
	

	 */
	
	
	public static void main(String[] args) {
		int serverPort = 30001;
		
		try {
			DatagramSocket socket = new DatagramSocket(serverPort);
			byte[] data = new byte[1024];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			
			
			InetAddress clientAddress = packet.getAddress();
			
			System.out.println("clientAddress : "+clientAddress.getHostAddress()+" : "+packet.getPort());
			String str = "UDP Server에서 전송하는 데이터";
			
			byte[] serverData = str.getBytes();
			DatagramPacket packet2 = new DatagramPacket(serverData, serverData.length,
					clientAddress, packet.getPort());
			
			socket.send(packet2);
			socket.close();;
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
