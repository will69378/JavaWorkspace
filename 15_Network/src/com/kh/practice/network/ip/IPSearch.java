package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class IPSearch {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 또는 도메인명 : ");
		String name = sc.next();
		
		
		try {
			InetAddress[] ip = InetAddress.getAllByName(name);
			
			for(int i = 0; i<ip.length; i++) {
				if(i==0) {
					System.out.println(ip[i].getHostName()+"는 "+ip.length+
							"개의 IP주소를 가지고 있습니다.");
				}
				System.out.println(i+1 +"번 IP = "+ip[i].getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
