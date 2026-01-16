package com.kh.chap03_protocol.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientRun {
	public static void main(String[] args) {
		try {
			InetAddress server = InetAddress.getByName("localhost");
			
			int serverPort = 30001;
			
			DatagramSocket socket = new DatagramSocket();
			String message = "데이터 전송 요청";
			
			byte[] sendData = message.getBytes();
			
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, server, serverPort);
			
			socket.send(sendPacket);
			
			byte[] data = new byte[1024];
			DatagramPacket receiveData = new DatagramPacket(data, data.length);
			socket.receive(receiveData);
			
			String receive = new String(
					receiveData.getData(), 0, receiveData.getData().length);
			
			System.out.println(receive);
			
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
